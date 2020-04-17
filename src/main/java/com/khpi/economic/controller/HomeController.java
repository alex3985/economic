package com.khpi.economic.controller;

import com.khpi.economic.entity.ResultCOCOMO;
import com.khpi.economic.entity.SystemType;
import com.khpi.economic.form.COCOMOForm;
import com.khpi.economic.repository.FactorRepository;
import com.khpi.economic.repository.SystemTypeRepository;
import com.khpi.economic.service.CocomoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private SystemTypeRepository systemtypeRepository;

    @Autowired
    private FactorRepository factorRepository;

    @Autowired
    private CocomoService cocomoService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("systemTypeList", systemtypeRepository.findAll());
        model.addAttribute("factorList", factorRepository.findAll());
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ResultCOCOMO calculate(@RequestBody @Valid COCOMOForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return null;
        }
        final ResultCOCOMO resultCOCOMO = new ResultCOCOMO();
        final double laborInput = cocomoService.calculateLaborInput(form.getCapacity(), form.getCoefA(), form.getCoefE(), form.getCoefMArray());
        resultCOCOMO.setLaborInput(laborInput);
        final double durationProduction = cocomoService.calculateDurationProduction(laborInput, form.getCoefG(), form.getCoefH());
        resultCOCOMO.setDurationProduction(durationProduction);
        final double averageNumberSpecialists = cocomoService.calculateAverageNumberSpecialists(laborInput, durationProduction);
        resultCOCOMO.setAverageNumberSpecialists(averageNumberSpecialists);
        final double averageProductivitySpecialists = cocomoService.calculateAverageProductivitySpecialists(form.getCapacity(), laborInput);
        resultCOCOMO.setAverageProductivitySpecialists(averageProductivitySpecialists);
        return resultCOCOMO;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<SystemType> homeREST() {
        return systemtypeRepository.findAll();
    }

}
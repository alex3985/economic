package com.khpi.economic.controller;

import com.khpi.economic.entity.SystemType;
import com.khpi.economic.repository.FactorRepository;
import com.khpi.economic.repository.SystemTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private SystemTypeRepository systemtypeRepository;

    @Autowired
    private FactorRepository factorRepository;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("systemTypeList", systemtypeRepository.findAll());
        model.addAttribute("factorList", factorRepository.findAll());
        return "home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<SystemType> helloRest() {
        return systemtypeRepository.findAll();
    }

}
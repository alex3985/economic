package com.khpi.economic.controller;

import com.khpi.economic.entity.SystemType;
import com.khpi.economic.repository.SystemTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private SystemTypeRepository repository;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("systemTypeList", repository.findAll());
        return model;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<SystemType> helloRest() {
        return repository.findAll();
    }

}
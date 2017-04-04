/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springmvcaccount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author iviettech
 */
@Controller
public class HelloController {
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public ModelAndView showHello()
    { 
        ModelAndView modelView= new ModelAndView();
        modelView.addObject("message","Hello Reader!");
        modelView.setViewName("hello"); // name of jsp page
        return modelView;
    }
}

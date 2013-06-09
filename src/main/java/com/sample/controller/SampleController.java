package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    

    @RequestMapping(value = "{id}")
    public String execute(@PathVariable("id") Long id, Model model) {
        model.addAttribute(new SampleModel(id, "name"));
        return "sample";
    }
}

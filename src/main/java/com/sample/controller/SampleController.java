package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    

    @RequestMapping(value = "{id}")
    public void execute(@PathVariable("id") Long id, Model model) {
        SampleModel m = new SampleModel(id, "name");
        m.addAttribute("red");
        m.addAttribute("green");
        model.addAttribute("result", m);
        // return "sample";
    }
}

package com.open.city.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenCityController {

    @GetMapping("/")
    public String map(Model model) {
        return "map";
    }
}

package com.yeimy.forum.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clase")
public class ClaseController {

    @PostMapping
    public void registredClass(@RequestBody String parameters){
        System.out.println("El request llego correctamente");
        System.out.println(parameters);
    }
}

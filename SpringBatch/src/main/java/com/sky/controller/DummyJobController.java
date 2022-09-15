package com.sky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("batchjob")
public class DummyJobController {

    @GetMapping("sample")
    public String getMessage(){
        return "Hello From batch job";

    }

}

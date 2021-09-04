package com.example.testSql.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

@RequestMapping("index")
    public  String index(){
    return "index";
}

}

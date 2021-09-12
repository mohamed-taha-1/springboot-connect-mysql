package com.example.testSql.controllers;


import com.example.testSql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.testSql.repository.useDataRepo;


@Controller
public class WebController {
    @Autowired
    useDataRepo repo;

        @RequestMapping("/saveData")
        @ResponseBody
        public String saveDate(User user){
         repo.save(user);
        return "success";
        }

  }

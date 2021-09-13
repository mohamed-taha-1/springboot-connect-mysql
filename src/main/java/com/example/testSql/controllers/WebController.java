package com.example.testSql.controllers;


import com.example.testSql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.testSql.repository.useDataRepo;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;


@Controller
public class WebController {
    @Autowired
    useDataRepo repo;

        @RequestMapping("/saveData")
        @ResponseBody
        public String saveDate(User user){
         repo.save(user);
        return "data";
        }

        @RequestMapping("/ShowData")
        public ModelAndView viewDate(){
            ModelAndView mv=new ModelAndView();
           List<User> dataList= repo.findAll();
           mv.addObject("data",dataList);
           mv.setViewName("data");
            return mv;
        }

  }

package com.example.testSql.controllers;


import com.example.testSql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.testSql.repository.useDataRepo;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;


//  Deal with data in my sql


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

        @RequestMapping("/ShowData")
        public ModelAndView viewDate(){
            ModelAndView mv=new ModelAndView();
           List<User> dataList= repo.findAll();
           mv.addObject("data",dataList);
           mv.setViewName("data");
            return mv;
        }

        @RequestMapping("/deleteData")
    public ModelAndView deleteData(@RequestParam("id") int id){
            repo.deleteById(id);
            ModelAndView mv=new ModelAndView();
            List<User> dataList= repo.findAll();
            mv.addObject("data",dataList);
            mv.setViewName("data");
            return mv;
        }


        @RequestMapping("/UpdateData")
        @ResponseBody
    public  String updateData(User user){
            User myUpdated=repo.findAllByEmail(user.getEmail());
            myUpdated.setFname(user.getFname());
            repo.save(myUpdated);
            return "success";
        }

  }

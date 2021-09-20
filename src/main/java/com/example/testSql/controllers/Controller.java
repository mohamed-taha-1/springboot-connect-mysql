package com.example.testSql.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    JdbcTemplate jdbc;



  @RequestMapping("/insert")
    public String index(){
      jdbc.execute("insert into student (Fname , email) values ('mohamed','ta@gmail.com')");
      return " inserted ";

  }










}

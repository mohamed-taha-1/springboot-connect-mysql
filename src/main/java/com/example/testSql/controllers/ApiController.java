package com.example.testSql.controllers;


import com.example.testSql.model.User;
import com.example.testSql.repository.useDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    useDataRepo repo;

    @RequestMapping("/viewData")
    public List<User> viewData(){
        return repo.findAll();
    }

    @GetMapping("/view/{email}")
    public User viewDataByName(@PathVariable("email") String email){
        return repo.findAllByEmail(email);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        repo.deleteById(id);
        return "success";
    }

    // ----------  post to server -------
    @PostMapping("/save")
    public String save(User user){
        repo.save(user);
        return "added";
    }

    //  --     Test   api  for user and admin role


    @GetMapping("/user")
    public String user(){

        return "User .. ";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Admin .. ";
    }



}

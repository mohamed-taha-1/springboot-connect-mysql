package com.example.testSql.model;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
    private String tecName ;

    public String getTecName() {
        return tecName;
    }

    public void setTecName(String tecName) {
        this.tecName = tecName;
    }
    public void runF(){
        System.out.println(" tec object ");
    }
}

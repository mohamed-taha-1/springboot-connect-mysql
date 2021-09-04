package com.example.testSql.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int custid;
    private String custName;
    @Autowired
    private  Technologies tec;

    public Technologies getTec() {
        return tec;
    }

    public void setTec(Technologies tec) {
        this.tec = tec;
    }



    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void display(){
        System.out.println(" customer object returned   well ");
        tec.runF();
    }


}

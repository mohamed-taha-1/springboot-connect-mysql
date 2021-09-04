package com.example.testSql;

import com.example.testSql.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestSqlApplication {

	public static void main(String[] args) {

	    ConfigurableApplicationContext context =SpringApplication.run(TestSqlApplication.class, args);
        Customer c =context.getBean(Customer.class);
		c.display();


	}

}

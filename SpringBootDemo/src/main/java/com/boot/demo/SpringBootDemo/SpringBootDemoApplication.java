package com.boot.demo.SpringBootDemo;

import com.boot.demo.SpringBootDemo.entity.Address;
import com.boot.demo.SpringBootDemo.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);

		Address address = null;// select * from address where cid=1
		//System.out.println(address.getCustomer());
		// select * from customer where cid=1
		Customer customer = null;

	}

}

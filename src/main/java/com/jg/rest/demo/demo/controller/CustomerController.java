package com.jg.rest.demo.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jg.model.Customer;



@RestController
public class CustomerController
{
    @RequestMapping("/")
    public List<Customer> findAll()
    {
      List<Customer> customerList = new ArrayList<Customer>();
      customerList.add(new Customer(1, "frank"));
      customerList.add(new Customer(2, "john"));
      return customerList;
    }
}

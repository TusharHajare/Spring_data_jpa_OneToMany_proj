package com.Collaboration.Spring_data_jpa_OneToMany_proj.controller;

//import com.Collaboration.Spring_data_jpa_OneToMany_proj.dto.OrderRequest;
import com.Collaboration.Spring_data_jpa_OneToMany_proj.entity.Customer;
import com.Collaboration.Spring_data_jpa_OneToMany_proj.entity.Product;
import com.Collaboration.Spring_data_jpa_OneToMany_proj.repository.CustomerRepository;
import com.Collaboration.Spring_data_jpa_OneToMany_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/map")
public class OrderController
{
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/store")
    public Customer placeOrder(@RequestBody Customer customer)
    {
        return customerRepository.save(customer);
    }

    @GetMapping("/{cid}")
    public Optional<Customer> findOrders(@PathVariable("cid") int cid)
    {
        return customerRepository.findById(cid);
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders()
    {
        return customerRepository.findAll();
    }
}

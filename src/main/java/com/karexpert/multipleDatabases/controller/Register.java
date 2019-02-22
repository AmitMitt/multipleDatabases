package com.karexpert.multipleDatabases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karexpert.multipleDatabases.dao.product.ProductRepository;
import com.karexpert.multipleDatabases.dao.user.UserRepository;
import com.karexpert.multipleDatabases.model.product.Product;
import com.karexpert.multipleDatabases.model.user.User;



@RestController
@RequestMapping("/demo")
public class Register {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;


    @GetMapping(value = "/user")
    public void createUser()
    {
        User user=new User();
        user.setAge(10);
        user.setEmail("amit.kumar@karexpert.com");
        user.setName("amit");
        userRepository.save(user);
    }
    @GetMapping(value = "/product")
    public void createProduct()
    {
        Product product=new Product();
        product.setName("chini");
        product.setPrice(240d);

        productRepository.save(product);
    }
}

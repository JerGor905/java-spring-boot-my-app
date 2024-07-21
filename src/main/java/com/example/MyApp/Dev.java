package com.example.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // Field Injection
    private Laptop laptop;

//    // Constructor Injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    // Setter Injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        laptop.compile();
        System.out.println("Working on an AWESOME project!");
    }

}

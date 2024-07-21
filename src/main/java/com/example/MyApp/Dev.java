package com.example.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // Field Injection
    @Qualifier("laptop")
    private Computer comp;

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
        comp.compile();
        System.out.println("Working on an AWESOME project!");
    }

}

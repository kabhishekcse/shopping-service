package com.example.retail.ShoppingCartSevice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mapping")
public class Shopping {
    @GetMapping
    public B shopingmethod(){
        B b=new B("abhishek","ara");
        return b;
    }
}

class B{
    public String name;
    public String add;

    public B(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}

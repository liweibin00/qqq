package com.itheima.web.impl;

import com.itheima.domain.Items;
import com.itheima.service.maven_items_service;
import com.itheima.web.maven_items_web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itmes")
public class maven_items_webImpl implements maven_items_web {

    @Autowired
    private maven_items_service maven_items_service;

    @RequestMapping("/showDetail")
    public String findById(Model model) {
        Items item = maven_items_service.findById(1);
        String name = item.getName();
        System.out.println(name);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}

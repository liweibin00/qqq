package com.itheima.service.impl;

import com.itheima.dao.maven_items_dao;
import com.itheima.domain.Items;
import com.itheima.service.maven_items_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("itemsService")
public class maven_items_serviceimpl implements maven_items_service {

    @Autowired
    private maven_items_dao maven_items_dao;

    public Items findById(Integer id) {
        Items item = maven_items_dao.findByid(id);
        System.out.println(item);

        return item;
        //sdsadsadsadsad
    }
}

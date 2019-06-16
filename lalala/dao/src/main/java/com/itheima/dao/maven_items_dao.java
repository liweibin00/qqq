package com.itheima.dao;


import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface maven_items_dao {

    @Select("select * from items where id=#{id}")
    public Items findByid(Integer id);

}

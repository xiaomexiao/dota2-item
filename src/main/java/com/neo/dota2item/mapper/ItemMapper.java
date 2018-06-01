package com.neo.dota2item.mapper;

import com.neo.dota2item.pojo.Item;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface ItemMapper {
    @Select("select * from items where id = #{id}")
    Item findById(@Param("id") int id);

    @Select("select * from items")
    ArrayList<Item> findAllItems();

    /*写like语句的时候 一般都会写成 like '% %'
    在mybatis里面写就是应该是 like  '%${name} %' 而不是 '%#{name} %'
    ${name} 是不带单引号的，而#{name} 是带单引号的*/
    @Select("select * from items where chineseName like '%${chineseName}%'")
    ArrayList<Item> findItemsByChineseName(@Param("chineseName") String chineseName);

    @Insert("insert into items(chineseName,imageName,price,active,passive,remarks,attribution,cooldown,mana,detail) " +
            "values(#{chineseName},#{imageName},#{price},#{active},#{passive},#{remarks},#{attribution},#{cooldown},#{mana},#{detail})")
    void addItem(Item item);

}

package com.neo.dota2item.controller;

import com.neo.dota2item.pojo.Item;
import com.neo.dota2item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("findAll")
    public @ResponseBody
    ArrayList<Item> findAll() {
        return itemService.findAllItems();
    }

    @RequestMapping("findByChineseName")
    public @ResponseBody
    ArrayList<Item> findByChineseName(@RequestBody Item item) {
        System.out.println("前台传来的：" + item.toString());
        return itemService.findItemsByChineseName(item.getChineseName());
    }

    @RequestMapping("addItem")
    public String addItem(Item item) {
        System.out.println("要添加的item：" + item.toString());
        itemService.addItem(item);
        System.out.println("添加成功");
        return "redirect:/items";
    }

}

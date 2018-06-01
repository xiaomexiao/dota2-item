package com.neo.dota2item.service.impl;

import com.neo.dota2item.pojo.Item;
import com.neo.dota2item.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ItemServiceImplTest {

    @Autowired
    ItemService itemService;

    @Test
    public void findById() {
        System.out.println(itemService.findById(2).toString());
    }

    @Test
    public void findAllItems() {
        ArrayList<Item> itemArrayList = itemService.findAllItems();
        for (Item item : itemArrayList) {
            System.out.println(item.toString());
        }
    }

    @Test
    public void findItemsByChineseName() {
        ArrayList<Item> itemArrayList = itemService.findItemsByChineseName("");
        for (Item item : itemArrayList) {
            System.out.println(item.toString());
        }
    }

    @Test
    public void addItem() {
//        Item item = new Item("精灵布带", "boots_of_elves", 450, "", "",
//                "", "+6敏捷", 0, 0, "轻巧且便于行动的柔韧纺织物。");
//        itemService.addItem(item);
    }
}
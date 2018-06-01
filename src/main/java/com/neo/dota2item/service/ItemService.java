package com.neo.dota2item.service;

import com.neo.dota2item.pojo.Item;

import java.util.ArrayList;

public interface ItemService {
    Item findById(int id);

    ArrayList<Item> findAllItems();

    ArrayList<Item> findItemsByChineseName(String chineseName);

    void addItem(Item item);
}

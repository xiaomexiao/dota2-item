package com.neo.dota2item.service.impl;

import com.neo.dota2item.mapper.ItemMapper;
import com.neo.dota2item.pojo.Item;
import com.neo.dota2item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired(required = false)
    private ItemMapper itemMapper;

    @Override
    public Item findById(int id) {
        return itemMapper.findById(id);
    }

    @Override
    public ArrayList<Item> findAllItems() {
        return itemMapper.findAllItems();
    }

    @Override
    public ArrayList<Item> findItemsByChineseName(String chineseName) {
        return itemMapper.findItemsByChineseName(chineseName);
    }

    @Override
    public void addItem(Item item) {
        itemMapper.addItem(item);
    }
}

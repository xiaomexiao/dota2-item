package com.neo.dota2item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("items")
    public String toItems() {
        return "items";
    }

    @RequestMapping("additem")
    public String toAddItem() {
        return "additem";
    }
}

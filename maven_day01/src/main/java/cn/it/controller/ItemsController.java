package cn.it.controller;


import cn.it.domain.items;
import cn.it.service.ItemsServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/items")
public class ItemsController {
   @Resource
   private ItemsServices services;

   @RequestMapping("/findById")
   public String findById(Model model){
       items items = services.findById(1);
       System.out.println(items);
       model.addAttribute("item",items);
       return "itemDetail";
   }
}

package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
    //获取商品
    List<Item> getItems(String orderId);
    //存储商品
    void decreaseNumbers(List<Item> list);
}

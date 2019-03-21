package cn.it.service.impl;

import cn.it.dao.ItemsDao;
import cn.it.domain.items;
import cn.it.service.ItemsServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemsServiceImpl implements ItemsServices{
    //创建daO层对象
    @Resource
    private ItemsDao dao;
    @Override
    public items findById(Integer id) {
        return dao.findById(id);
    }
}

package com.example.demo.controller;

import com.example.demo.dao.EmbDao;
import com.example.demo.model.Emc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emc")
public class EmcController {

    @Autowired
    private EmbDao embDao;

    @RequestMapping("/list")
    public List<Emc> query(){
        return embDao.query();
    }


    @RequestMapping("/get/{id}")
    public Emc getById(@PathVariable("id") String id){
        return embDao.getById(Integer.parseInt(id));
    }


    @RequestMapping("/save")
    public void add(Emc emc){
        embDao.insert(emc);
    }

    @RequestMapping("/update")
    public void update(Emc emc){
        embDao.update(emc);
    }

}

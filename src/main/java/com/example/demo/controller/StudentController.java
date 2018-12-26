package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentDao studentDao;

    @RequestMapping("/list")
    public List<Student> getAll(){
        return this.studentDao.getAll();
    }

    @RequestMapping("/getOne/{id}")
    public Student getOne(@PathVariable("id") Integer id){
        return this.studentDao.findOne(id);
    }

    @RequestMapping("/save")
    public void getOne(Student student){
        this.studentDao.save(student);
    }

    @RequestMapping("/update")
    public void update(Student student){
        this.studentDao.update(student);
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        this.studentDao.delete(id);
    }
}

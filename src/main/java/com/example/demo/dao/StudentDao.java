package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;


public interface StudentDao {

    public List<Student> getAll();

    public Student findOne(Integer id);

    public void save(Student student);

    public void delete(Integer id);

    public void update(Student student);
}

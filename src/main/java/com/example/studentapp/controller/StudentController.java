package com.example.studentapp.controller;

import com.example.studentapp.model.Student;
import com.example.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;

    // create student
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    // get all Students
    @GetMapping
    public List<Student> getStudents(){
        return service.getAllStudents();
    }


    // delete student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        service.deleteStudent(id);
    }
}
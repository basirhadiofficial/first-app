package com.springboot.firstapp.controller;

import com.springboot.firstapp.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("basir", "hadi");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        // creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("basir", "hadi"));
        students.add(new Student("Himanshu", "singhal"));
        students.add(new Student("Piyush", "agarwal"));
        students.add(new Student("tanveer", "saifi"));
        return students;
    }
}

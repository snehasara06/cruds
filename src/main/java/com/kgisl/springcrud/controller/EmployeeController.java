package com.kgisl.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgisl.springcrud.Employee;
import com.kgisl.springcrud.EmployeeDao;
@Controller
@RequestMapping("/books")

public class EmployeeController {
    {System.out.println("EmployeeController");}
@Autowired
private EmployeeDao empDao;

    @GetMapping("/")
    public String getAll(Model book) {
        List < Employee > empList = empDao.getEmployees();
        book.addAttribute("empList", empList);
        empList.forEach(System.out::println);
        return "empList";
    }
}

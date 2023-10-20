package com.kgisl.springcrud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String dept;

    @Column 
    private Long phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Employee(int id, String name, String email, String dept, Long phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.phone = phone;
    }

    public Employee(String name, String email, String dept, Long phone) {
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.phone = phone;
    }

    public Employee() {
    }


    
    
}

package com.example.school_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "teachers")
@Data
@EqualsAndHashCode(callSuper = true)
public class Teacher extends Employee
{
    private String subject;
    private String assignedClass;
    private String previousSchool;
}
package com.example.school_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "finance_staff")
@Data
@EqualsAndHashCode(callSuper = true)
public class Finance extends Employee
{
    private boolean isAuthorizedSignatory;
}
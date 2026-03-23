package com.example.school_management.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Full name is required")
    private String fullName;
    @Column(unique = true, nullable = false)
    @Email(message = "Invalid email format")
    private String email;
    @NotBlank
    private String password;
    @Column(length = 10, nullable = false)
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile must be 10 digits")
    private String mobile;
    private String gender;
    private LocalDate dob;
    private String street;
    private String city;
    private String state;
    @Column(length = 6, nullable = false)
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be 6 digits")
    private String pincode;
    @Column(nullable = false)
    private String documentsPdfPath;
    @PositiveOrZero
    private Integer yearsOfExperience;
}
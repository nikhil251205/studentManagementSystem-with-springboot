package com.owncompany.student_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String name;
    @NotEmpty
    private String course;
    @NotNull
    @Max(60)
    @Min(18)
    private int age;
    @Email
    private String email;
    private long phoneNumber;


}

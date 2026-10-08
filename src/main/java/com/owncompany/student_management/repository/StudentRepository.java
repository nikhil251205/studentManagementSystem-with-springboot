package com.owncompany.student_management.repository;

import com.owncompany.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    // In this class have many methods to access all operations
}

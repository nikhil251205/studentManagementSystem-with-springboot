package com.owncompany.student_management.Service;

import com.owncompany.student_management.entity.Student;
import com.owncompany.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;



    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    public Student getById(int id){
        return studentRepository.getById(id);
    }

}

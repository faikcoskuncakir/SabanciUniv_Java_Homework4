package com.example.faikcoskuncakir_homework4.service;

import com.example.faikcoskuncakir_homework4.model.Student;
import com.example.faikcoskuncakir_homework4.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
    public Student getById(Integer id) {
        return studentRepository.
                findById((id)).
                orElseThrow(() -> new RuntimeException("Student not found."));
    }
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }
}
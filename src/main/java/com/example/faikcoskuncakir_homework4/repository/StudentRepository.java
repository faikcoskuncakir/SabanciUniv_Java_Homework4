package com.example.faikcoskuncakir_homework4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.faikcoskuncakir_homework4.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // add any custom methods here
}

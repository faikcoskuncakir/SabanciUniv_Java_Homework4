package com.example.faikcoskuncakir_homework4.repository;

import com.example.faikcoskuncakir_homework4.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("select s from Student s where s.id =:studentId")
    Student findStudentByStudentId(int studentId);
}

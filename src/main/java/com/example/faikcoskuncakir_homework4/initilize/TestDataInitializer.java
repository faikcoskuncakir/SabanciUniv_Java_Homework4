package com.example.faikcoskuncakir_homework4.initilize;

import com.example.faikcoskuncakir_homework4.model.Student;
import com.example.faikcoskuncakir_homework4.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.Month;

@Component
@RequiredArgsConstructor
public class TestDataInitializer implements CommandLineRunner {

    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (studentRepository.count() == 0) {
            Student student1 = new Student("Faik Coskun", "Cakir", 27);
            Student student2 = new Student("Kemal Fatih", "Cakir", 32);
            Student student3 = new Student("Celal", "Cakir", 61);
            studentRepository.save(student1);
            studentRepository.save(student2);
            studentRepository.save(student3);

        }
    }
}
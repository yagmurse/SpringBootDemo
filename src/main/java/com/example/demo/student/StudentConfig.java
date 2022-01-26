package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student Mariam = new Student(
                    1L,
                    "Mariam",
                    "Mariam.jamal@gmail",
                    LocalDate.of(1996, Month.DECEMBER, 11)
            );
            Student alex = new Student(
                    "Alex",
                    "Alex.jamal@gmail",
                    LocalDate.of(1996, Month.JANUARY, 12)
            );
            repository.saveAll(
                    List.of(Mariam,alex)
            );
        };
    }
}

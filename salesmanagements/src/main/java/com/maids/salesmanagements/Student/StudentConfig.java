package com.maids.salesmanagements.Student;

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
            Student ahmad = new Student(
                    "ahmad",
                    "ahmad.job@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5));
            Student yousef = new Student(
                    "yousef",
                    "yousef.job@gmail.com",
                    LocalDate.of(1996, Month.APRIL, 12));

            repository.saveAll(
                    List.of(ahmad, yousef)
            );
        };
    }
}

package com.example.studentapplication;

import com.example.studentapplication.entities.Student;
import com.example.studentapplication.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentRepository studentRepository){
        return args -> {

            Student student1 = Student.builder().fName("zkaria").lName("Darouich").email("Zakaria.darouich@outlook.com").build();
            Student student2 = Student.builder().fName("oussama").lName("oukhayi").email("oussama.oukhayi@outlook.com").build();
            studentRepository.save(student1);
            studentRepository.save(student2);


            System.out.println(student1);
            System.out.println("------------------");
            System.out.println(student2);
        };





        }

    }



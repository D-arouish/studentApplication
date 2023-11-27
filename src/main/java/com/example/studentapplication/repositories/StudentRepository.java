package com.example.studentapplication.repositories;

import com.example.studentapplication.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestController
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

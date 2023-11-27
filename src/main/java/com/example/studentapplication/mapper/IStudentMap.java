package com.example.studentapplication.mapper;

import com.example.studentapplication.dto.StudentRequestDTO;
import com.example.studentapplication.dto.StudentResponseDTO;
import com.example.studentapplication.entities.Student;

public interface IStudentMap {
    Student fromReuestDTOToEtudient(StudentRequestDTO StudentRequestDTO);
    StudentResponseDTO etudient2EtudientResponseDTO(Student student);
}

package com.example.studentapplication.services;

import com.example.studentapplication.dto.StudentRequestDTO;
import com.example.studentapplication.dto.StudentResponseDTO;

import java.util.List;

public interface StudentServices {
    void add (StudentRequestDTO etudientRequestDTO);
    List<StudentResponseDTO> listerEtudients();
    StudentResponseDTO etudientById(Integer id);
    void update (Integer id, StudentRequestDTO etudientRequestDTO);
    void delete (Integer id);
}

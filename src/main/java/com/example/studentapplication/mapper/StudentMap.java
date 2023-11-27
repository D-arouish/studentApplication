package com.example.studentapplication.mapper;

import com.example.studentapplication.dto.StudentRequestDTO;
import com.example.studentapplication.dto.StudentResponseDTO;
import com.example.studentapplication.entities.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


@Component
public class StudentMap implements IStudentMap{
    @Override
    public Student fromReuestDTOToEtudient(StudentRequestDTO StudentRequestDTO) {
        Student student = new Student();
        student.setFName(StudentRequestDTO.getFname());
        student.setLName(StudentRequestDTO.getLname());
        student.setEmail(StudentRequestDTO.getEmail());
        return student;


    }

    @Override
    public StudentResponseDTO etudient2EtudientResponseDTO(Student student) {
        StudentResponseDTO s = new StudentResponseDTO();
        BeanUtils.copyProperties(student,s);
        return s;

    }
}

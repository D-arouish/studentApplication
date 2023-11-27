package com.example.studentapplication.services;

import com.example.studentapplication.dto.StudentRequestDTO;
import com.example.studentapplication.dto.StudentResponseDTO;
import com.example.studentapplication.entities.Student;
import com.example.studentapplication.mapper.IStudentMap;
import com.example.studentapplication.repositories.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class StudentServiceImp implements StudentServices{

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    IStudentMap iStudentMap;
    @Override
    public void add(StudentRequestDTO etudientRequestDTO) {
        Student student;
        student = iStudentMap.fromReuestDTOToEtudient(etudientRequestDTO);
        studentRepository.save(student);

    }

    @Override
    public List<StudentResponseDTO> listerEtudients() {
        List<Student> list1 = studentRepository.findAll();
        List<StudentResponseDTO> list2 = new ArrayList<>();
        for (Student c : list1){
            StudentResponseDTO r = new StudentResponseDTO();
            BeanUtils.copyProperties(c,r);
            list2.add(r);
        }
        return  list2;
    }

    @Override
    public StudentResponseDTO etudientById(Integer id) {
        Student student = studentRepository.findById(id).get();
        return iStudentMap.etudient2EtudientResponseDTO(student);
    }

    @Override
    public void update(Integer id, StudentRequestDTO etudientRequestDTO) {

        Student student = studentRepository.findById(id).get();
        if (!etudientRequestDTO.getFname().isEmpty())student.setFName(etudientRequestDTO.getFname());
        if (!etudientRequestDTO.getLname().isEmpty() )student.setLName(etudientRequestDTO.getLname());
        if (!etudientRequestDTO.getEmail().isEmpty())student.setEmail(etudientRequestDTO.getEmail());

        studentRepository.save(student);
    }

    @Override
    public void delete(Integer id) {

        studentRepository.deleteById(id);
    }
}

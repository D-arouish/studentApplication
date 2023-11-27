package com.example.studentapplication.web;


import com.example.studentapplication.dto.StudentRequestDTO;
import com.example.studentapplication.dto.StudentResponseDTO;
import com.example.studentapplication.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    StudentServices studentServices;
    @GetMapping("/students")
    public List<StudentResponseDTO> getAll(){
        return studentServices.listerEtudients();
    }

    @GetMapping("/students/{id}")
    public StudentResponseDTO getId(@PathVariable("id") Integer id){
        return studentServices.etudientById(id);
    }

    @PostMapping("/students")
    public void saveEtudient(@RequestBody StudentRequestDTO e){
        studentServices.add(e);
    }

    @PutMapping ("/students/{id}")
    public void update(@PathVariable("id") Integer id,@RequestBody StudentRequestDTO e){
        studentServices.update(id,e);
    }

    @DeleteMapping("/students/{id}")
    public void deletEtudient(@PathVariable("id") Integer id ){
        studentServices.delete(id);
    }
}

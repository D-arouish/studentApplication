package com.example.studentapplication.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StudentResponseDTO {

    private Integer id;
    private String nom;
    private String prenom;
    private String email;
}

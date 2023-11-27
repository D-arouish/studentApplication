package com.example.studentapplication.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StudentRequestDTO {
    private String fname;
    private String lname;
    private String email;
}

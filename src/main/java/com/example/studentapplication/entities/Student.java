package com.example.studentapplication.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Entity
public class Student {
    @Column
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idStudent;
    @Column
    private String fName;
    @Column
    private String lName;
    @Column
    private String email;


}

package com.example.stackoverflow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.* ;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @Column(unique = true, length = 20)
    private String userName;

    @Column(length = 512)
    private String password;


    @OneToMany(mappedBy = "questionId", cascade = CascadeType.ALL)
    List<Question> questions;

}

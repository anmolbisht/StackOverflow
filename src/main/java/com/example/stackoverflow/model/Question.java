package com.example.stackoverflow.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long questionId;


    @ManyToOne(cascade=CascadeType.ALL)
    private User user;

    private String questionName;



}

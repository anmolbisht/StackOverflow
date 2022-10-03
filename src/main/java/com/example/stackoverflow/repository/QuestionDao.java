package com.example.stackoverflow.repository;

import com.example.stackoverflow.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question,Long> {

}

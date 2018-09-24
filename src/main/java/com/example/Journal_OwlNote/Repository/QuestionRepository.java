package com.example.Journal_OwlNote.Repository;

import com.example.Journal_OwlNote.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

//    Object getAllQuestions();
}

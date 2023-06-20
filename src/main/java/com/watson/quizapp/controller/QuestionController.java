package com.watson.quizapp.controller;

import com.watson.quizapp.model.Question;
import com.watson.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allquestions")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestions();
    }
}

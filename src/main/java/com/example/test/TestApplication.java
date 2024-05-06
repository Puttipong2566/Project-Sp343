package com.example.test;

import com.example.test.model.Activity;
import com.example.test.model.Students;
import com.example.test.repository.ActivityRepository;
import com.example.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {
    @Autowired
    ActivityRepository activityRepository;
    @Autowired
    StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    }


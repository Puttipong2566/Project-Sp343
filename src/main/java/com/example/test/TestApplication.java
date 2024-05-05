package com.example.test;

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
        ShowAllActivity();
        ShowAllStudents();
    }

    public void ShowAllActivity() {
        List<Activity> activityList = activityRepository.findAll();
        System.out.println("Total activities: " + activityList.size());
    }

    public void ShowAllStudents() {
        List<Students> studentList = studentRepository.findAll();
        System.out.println("Total students: " + studentList.size());
    }
}

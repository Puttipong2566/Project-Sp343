package com.example.test.controller;

import com.example.test.model.Activity;
import com.example.test.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@RequestMapping("/assets")



public class MainController {
    @Autowired
    private ActivityRepository activityRepository;

    @GetMapping({"/activity"})
    String getAllActivity(Model model) {
    List<Activity> activity = activityRepository.findAll();
    model.addAttribute("activity",activity);
    return "index";
    }

    @GetMapping("/")
    public List <Activity > Tesst(){
        return activityRepository.findAll();
    }

}

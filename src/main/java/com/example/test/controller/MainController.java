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
@RequestMapping("/Test")



public class MainController {
    @Autowired
    private ActivityRepository activityRepository;
    @GetMapping("/AllActivity")
    String getAllActivity(Model model) {
    List<Activity> activityRepositoryAll = activityRepository.findAll();
    model.addAttribute("all_activity",activityRepositoryAll);
    return "index";
    }

    @GetMapping("/")
    public List <Activity > Tesst(){
        return activityRepository.findAll();
    }

}

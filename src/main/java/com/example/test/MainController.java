package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MainController {
    @Autowired
    private   ActivityRepository activityRepository;
    @GetMapping("/AllActivity")
    String getAllActivity(Model model) {
    List<Activity> activityRepositoryAll = activityRepository.findAll();
    model.addAttribute("all_activity",activityRepositoryAll);
    return "AllActivity";
    }
}

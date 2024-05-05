package com.example.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Activity")
public class Activity {
    @Id
    private String id ;
    public  String ActivityDescription;
    public  String Image;
    public  String Location;
    public  String ActivityName;
    public  String Time;
    public  String Date;

    public Activity(String activityDescription, String image, String location, String activityName, String time, String date) {
        ActivityDescription = activityDescription;
        Image = image;
        Location = location;
        ActivityName = activityName;
        Time = time;
        Date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityDescription() {
        return ActivityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        ActivityDescription = activityDescription;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getActivityName() {
        return ActivityName;
    }

    public void setActivityName(String activityName) {
        ActivityName = activityName;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}

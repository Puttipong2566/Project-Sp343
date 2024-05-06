package com.example.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Students")
public class Students {
    @Id
    private String id ;
    private String first_name;
    private String last_name;
    private String student_id;


}

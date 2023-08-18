package com.springboot.course.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "React", "Kamran"),
                new Course(2, "Javascript", "Danish"),
                new Course(3, "MongoDB", "Owais"),
                new Course(4, "Express.js", "Abu Turab"),
                new Course(5, "tailwindCSS", "Kamran")

        );
    }
}

package com.springboot.course.springboot;

public class Course {

    private long courseId;
    private String courseName;
    private String courseAuthor;

    /*
    * 1. Generate constructor
    * 2. Generate getters
    * 3. Generate toString
    * */
    public Course(long courseId, String courseName, String courseAuthor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAuthor = courseAuthor;
    }

    public long getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseAuthor='" + courseAuthor + '\'' +
                '}';
    }
}

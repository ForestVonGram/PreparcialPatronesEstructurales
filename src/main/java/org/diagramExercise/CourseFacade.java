package org.diagramExercise;

import java.util.HashMap;
import java.util.Map;

public class CourseFacade {
    private Map<Integer, Course> courses;
    private Map<Integer, Map<Integer, Student>> courseStudents;
    private Map<Integer, Map<Integer, Grade>> courseGrades;


    public CourseFacade() {
        this.courses = new HashMap<>();
        this.courseStudents = new HashMap<>();
        this.courseGrades = new HashMap<>();
    }

    public void getCourseInfor(int courseID) {
        Course course = courses.get(courseID);

        if (course != null) {
            System.out.println("Course name: " + course.getName());
            System.out.println("Course ID: " + course.getCode());
        }
        else {
            System.out.println("Course not found.");
        }
    }

    public void registerStudent(int studentID, int courseID, String studentName) {
        Course course = courses.get(courseID);

        if (course != null) {
            Map<Integer, Student> students = courseStudents.computeIfAbsent(courseID, k -> new HashMap<>());
            students.put(studentID, new Student(studentName, studentID));
            System.out.println("Student registered: " + course.getName());
        }
        else {
            System.out.println("Course not found.");
        }
    }
    public void submitGrade(Grade grade, int studentID, int courseID) {
        Course course = courses.get(courseID);
        if (course != null) {
            Map<Integer, Grade> grades = courseGrades.computeIfAbsent(courseID, k -> new HashMap<>());
            grades.put(studentID, grade);
            System.out.println("Grade submitted: " + course.getName());
        }
        else {
            System.out.println("Course not found.");
        }
    }
}
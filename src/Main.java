import Student.Student1;
import Student.Group;
import  Student.Course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student1 student1 = new Student1();
        student1.name1 = "Yryskeldi";
        student1.year = 2006;
        student1.email1= "all";
        Student1 [] student1s = {student1};


        Group group = new Group();
        group.lesson = "Access modifiers";
        group.data = 9|11|2022;
        Group [] groups = {group};
        group.getget(student1s);


        Course course = new Course();
        course.courseName = "Java Backend";
        course.number = 1234;
        course.teacherName = "Aijamal ";
        course.changeIn(groups);
        course.changeInformation();



    }
}
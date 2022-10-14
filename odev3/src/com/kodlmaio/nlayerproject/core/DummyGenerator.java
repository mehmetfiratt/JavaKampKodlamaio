package com.kodlmaio.nlayerproject.core;

import com.kodlmaio.nlayerproject.entities.Category;
import com.kodlmaio.nlayerproject.entities.Course;
import com.kodlmaio.nlayerproject.entities.Instructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class DummyGenerator {
    public static ArrayList<Instructor> getDummyInstructors() {
        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
        Instructor instructor2 = new Instructor(2, "Atakan", "Yılmaz");
        Instructor instructor3 = new Instructor(3, "Kürşat", "Kara");
        return new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2, instructor3));
    }

    public static ArrayList<Category> getDummyCategory() {
        Category category1 = new Category(1, "Backend");
        Category category2 = new Category(2, "Frontend");
        Category category3 = new Category(3, "Data Analyst");
        return new ArrayList<Category>(Arrays.asList(category1, category2, category3));
    }

    public static ArrayList<Course> getDummyCourse() {
        Course course1 = new Course(1, "java", 1000, LocalDateTime.now());
        Course course2 = new Course(2, "C#", 2000, LocalDateTime.now());
        Course course3 = new Course(3, "Angular", 40000, LocalDateTime.now());
        return new ArrayList<Course>(Arrays.asList(course1, course2, course3));
    }
}

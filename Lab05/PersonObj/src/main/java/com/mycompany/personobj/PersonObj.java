package com.mycompany.personobj;

public class PersonObj {

    public static void main(String[] args) {
        Student student = new Student("Themiya", 12345, "Computer Science");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Course: " + student.getCourse());

        System.out.println();

        Lecturer lecturer = new Lecturer("Kasun", 98765, "Software Engineering");


        System.out.println("Lecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getId());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}

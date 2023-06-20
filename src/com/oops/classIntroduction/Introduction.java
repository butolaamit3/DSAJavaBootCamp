package com.oops.classIntroduction;

import java.sql.Struct;

public class Introduction {
    public static void main(String[] args) {


        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // if you want to assignee all the properties in a one go you need class
        Student amit  = new Student(); // without parameter
        System.out.println(amit.rno);

        Student rahul = new Student(12,"rahul",78.34f);
        System.out.println(amit.name);
        System.out.println(amit.rno);
        System.out.println(amit.marks);

        System.out.println();
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
        System.out.println();

        Student random = new Student(amit);
        System.out.println(random.name);

    }
}
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above
    // properties object by object
    // we need one word to access every object

//    public Student() {
//        this.rno = 345;
//        this.name = "Amit";
//        this.marks = 89.34f;
//    }
    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }
}

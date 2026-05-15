package org.example;

public class Student {

    private String name;
    private int age;
    private String course;

    public Student() {
        this.name = "Nobody";
        this.age = 0;
        this.course = "Nothing";
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = Math.max(age, 0);
        this.course = course;
    }

    public void introduce() {
        System.out.printf("Hi, my name is %s\n", this.name);
        System.out.printf("I am %d years old\n", this.age);
        System.out.printf("I study %s%n", this.course);
    }
}


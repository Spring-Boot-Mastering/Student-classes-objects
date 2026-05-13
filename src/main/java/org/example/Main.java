package org.example;

public class Main {
    static void main() {
        Student student1 = new Student("Peter Herrmann", 23, "Architectural engineer");
        Student student2 = new Student("Josef Peters", 20, "Computer Science");

        student1.introduce();

        System.out.println();

        student2.introduce();
    }
}

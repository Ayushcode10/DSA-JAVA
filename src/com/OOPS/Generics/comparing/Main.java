package com.OOPS.Generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(19,99);
        Student student2 = new Student(20,100);


        if(student1.compareTo(student2) <0 ){
            System.out.println("student2 has more marks");
        }
    }
}

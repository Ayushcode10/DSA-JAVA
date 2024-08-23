package com.OOPS;

public class main {

    //for every single student
    public static class Student{
        String name;
        int rno;
        float marks;

        Student(String name, int rno, float marks){
            this.name = name;
            this.rno = rno;
            this.marks = marks;
        }

        void greet(){
            System.out.println("helloo! "+ name);
        }

        Student(){
            this("default",0,100f);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("ayush",19,100);
        Student s2 = new Student("ro",11,100);
        Student s3 = new Student("santru",14,100);


        s1.greet();
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}

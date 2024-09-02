package com.OOPS.Generics.comparing;

public class Student implements Comparable<Student>{

    int rollNo;
    float marks;

    public Student(int rno, float marks){
        this.rollNo = rno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o){
        int diff = (int)(this.marks - o.marks);

        //if diff == 0, both are equal
        //if diff < 0, o is bigger
        //else , o is smaller

        return diff;
    }
}

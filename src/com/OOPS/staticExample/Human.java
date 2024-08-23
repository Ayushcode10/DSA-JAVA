package com.OOPS.staticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean gender;

    static long population;

    public Human(String name, int age, int sal, boolean gender){
        this.name = name;
        this.age = age;
        this.salary = sal;
        this.gender = gender;
        /*  since it is a common(static) value for all the objects in the class
            following the convention, whenever you are accessing,modifying, declaring
            a static variable then don't do it via the ref variable
            rather use the CLASS_NAME */
        Human.population += 1;
    }
}


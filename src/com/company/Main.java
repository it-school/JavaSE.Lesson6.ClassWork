package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        Student student = new Student();
        student.name = "John Silver";
        student.setBirthday(new Date(1500, 5, 21));
        student.setHeight(150);
        System.out.println(student.toString());

        Student student1 = new Student();
        student1.name = "John Silver";
        student1.setBirthday(new Date(2100, 5, 21));
        student1.setHeight(150);

        System.out.println(student1);


        System.out.println(student1.Equals(student));
    }
}

package com.company;

import java.util.Date;

public class Student
{
    String name;
    private Date birthday;
    private int height;
    State state;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday.compareTo(new Date()) > 0 ? new Date() : birthday;
    }

    public Student()
    {
    }

    public Student(String name, Date birthday, int height)
    {
        this.name = name;
        this.setHeight(height);
        setBirthday(birthday);
    }

    public Student(String name, Date birthday, User user) {
        this.name = name;
        setBirthday(birthday);
        user.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height < 45 || height > 280 ? -1 : height;
    }

    boolean Equals(Student student)
    {
        return this.name.equals(student.name) && this.birthday.compareTo(student.birthday) == 0 && this.height == student.height;
    }

    @Override
    public String toString() {
        return name + "\t(" + birthday.toGMTString() + "), height: " + height;
    }


}

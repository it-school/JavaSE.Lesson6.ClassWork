package com.company;

import java.util.Date;

public class Student
{
    String name;
    private Date birthday;
    private int height;

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

    public void setHeight(int height) {
        this.height = height < 30 || height > 300 ? 100 : height;
    }

    public int getHeight() {
        return height;
    }

    boolean Equals(Student student)
    {
        if (name.equals(student.name) && birthday.compareTo(student.birthday) == 0 && height == student.height )
            return true;

        return false;
    }

    @Override
    public String toString() {
        return name + "\t(" + birthday.toGMTString() + "), height: " + height;
    }
}

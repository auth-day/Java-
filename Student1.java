package dwa.awd;

import java.util.Scanner;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class Student
{
    private int Age;
    private int ID;
    private String name;
    private String SecondName;
    int  count = 0;
    static List<Student> object = new ArrayList<Student>();

    Student(String name, String SecondName, int Age, int count)
    {
    this.name = name;
    this.Age = Age;
    this.count = count;
    this.SecondName = SecondName;
    object.add(this);
    }


    void show()
    {
        System.out.println(this.count + ". Имя: " +  this.name + "\n   Лет: " + this.Age + "\n   Фамилия: " + this.SecondName + "\n");
    }

    void showAll()
    {
        for(Student x : object)
            x.show();
    };

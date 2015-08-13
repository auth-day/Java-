package dwa.awd;

/**
 * Created by IntelliJ IDEA.
 * User: Dima
 * Date: 12.08.2015
 * Time: 2:14:21
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;
import java.io.IOException;
public class Student
{
    private int Age;
    private int ID;
    private String name;
    private String SecondName;
    //Конструкторы
    Student(){}
    Student(int a,int b, String n, String s)
    {
        Age = a;
        ID = b;
        name = n;
        SecondName = s;
    };
    //Пример
    public void MethodExample()
    {
        Age = 18;
        ID = 10101;
        name = "Name";
        SecondName = "Example";
        System.out.println("Пример ввода данных:\n" +
                            "Age: " + Age + "\n" +
                            "ID: " + ID + "\n" +
                            "Name: " + name +  "\n" +
                            "SecondName: " + SecondName + "\n\n");
        
        }

    void Starting()
    {
        Scanner in = new Scanner(System.in);
        int example = in.nextInt();
        this.Method(example);
    }

    void Method(int number)
    {
        switch (number)
        {
            case 1:
                this.AskQuestion();
                System.out.println("Продолжим или остановимся на этом?\n");
                this.Intro();
                this.Starting();
                break;
           case 2: this.MethodExample();
                   this.Intro();
                   this.Starting();
                break;
            case 3: System.exit(0);
                break;
            default:
                    System.out.println("Выберите номер");
                    this.Intro();
                    this.Starting();
        }

    }


    public  void Intro()
    {

        System.out.println("Начать ввод данных: 1\n"+
                            "Пример ввода данных: 2\n" +
                            "Закончить работу: 3");
    }

    void IntroFirst()
    {
         System.out.println("Программа прежназначена для ввода данных студентов.\n ");
    }

    void AskQuestion()
    {
        Scanner start = new Scanner(System.in);
                    System.out.println("Сколько лет студенту");
                    int q = start.nextInt();
                    System.out.println("Какой ID");
                    int w = start.nextInt();
                    System.out.println("Имя студента");
                    String e = start.next();
                    System.out.println("Фамилия ");
                    String r = start.next();
                    Student a = new Student(q,w,e,r);
                    System.out.println("Вы ввели:\n" +
                            "Age: " + a.Age + "\n" +
                            "ID: " + a.ID + "\n" +
                            "Name: " + a.name +  "\n" +
                            "SecondName: " + a.SecondName + "\n\n\n" );
    }

}




package ru.javacourse.lessonFive;

public class Employee {
    private String fio;
    private String job;
    private String eMail;
    private String phone;
    private int salary;
    private int age;

    /*
    Конструктор класса Employee, p - означает параметр.
     */
    public Employee(String fio, String job, String eMail, String phone, int salary, int age) {
        this.fio = fio;
        this.job = job;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    /*
    Геттеры
     */
    public String getFio(){
        return fio;
    }

    public String getJob(){
        return job;
    }

    public String getMail(){
        return eMail;
    }

    public String getPhone(){
        return phone;
    }

    public int getSalary(){
        return salary;
    }

    public int getAge(){
        return age;
    }

}

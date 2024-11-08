//An educational institution maintains a database of its employees. The database is divided into a number of classes whose hierarchical relationships are shown below. Write all the classes and define the methods to create the database and retrieve individual information as and when needed. Write a driver program to test the classes. 
//Staff(code,name)Teacher(subject,publication)is a Staff Officer(grade)is a Staff Typist(speed)is a Staff RegularTypist(remuneration)is a Typist CasualTypist(daily wages)is a Typist.

import java.util.*;

class Staff {
    protected int code;
    protected String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    void display() {
        System.out.println("\nCode: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private int publication;

    public Teacher(int code, String name, String subject, int publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication ID: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    protected int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Typing Speed: " + speed + " words per minute");
    }
}

class RegularTypist extends Typist {
    private int remuneration;

    public RegularTypist(int code, String name, int speed, int remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Monthly Remuneration: Rs. " + remuneration);
    }
}

class CasualTypist extends Typist {
    private int dailyWages;

    public CasualTypist(int code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Daily Wages: Rs. " + dailyWages);
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        Staff staff = new Staff(111, "Sayak");
        staff.display();

        Teacher teacher = new Teacher(222, "Arnab", "History", 10102002);
        teacher.display();

        Officer officer = new Officer(333, "Aniket", "A");
        officer.display();

        Typist typist = new Typist(444, "Utsav", 90);
        typist.display();

        RegularTypist regularTypist = new RegularTypist(555, "Sohom", 100, 721);
        regularTypist.display();

        CasualTypist casualTypist = new CasualTypist(666, "Srikanta", 150, 500);
        casualTypist.display();
    }
}

//1.Create an interface Department containing attributes deptName and deptHead. It also has abstract methods for printing the attributes. Create a class hostel containing hostelName, hostelLocation and numberofRooms. The class contains methods for getting and printing the attributes. Then write Student class extending the Hostel class and implementing the Department interface. This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and printData methods for this class. Also implement the abstract methods of the Department interface. Write a driver class to test the Student class. The program should be menu driven containing the options: i) Admit new student ii) Migrate a student iii) Display details of a student For the third option a search is to be made on the basis of the entered registration number

import java.util.ArrayList;
import java.util.Scanner;

interface Department {
    String deptName = "";
    String deptHead = "";

    void printDepartmentDetails();
}

class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;

    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void getHostelData(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    private String studentName;
    private String regdNo;
    private String electiveSubject;
    private double avgMarks;

    public Student(String hostelName, String hostelLocation, int numberOfRooms) {
        super(hostelName, hostelLocation, numberOfRooms);
    }

    void getStudentData(String studentName, String regdNo, String electiveSubject, double avgMarks) {
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    void printStudentData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printHostelData();
        printDepartmentDetails();
    }

    public void printDepartmentDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }

    public String getRegdNo() {
        return regdNo;
    }
}

public class Interfaces1 {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void admitNewStudent() {
        System.out.print("Enter Hostel Name: ");
        String hostelName = sc.next();
        System.out.print("Enter Hostel Location: ");
        String hostelLocation = sc.next();
        System.out.print("Enter Number of Rooms: ");
        int numberOfRooms = sc.nextInt();
        Student student = new Student(hostelName, hostelLocation, numberOfRooms);

        System.out.print("Enter Student Name: ");
        String studentName = sc.next();
        System.out.print("Enter Registration Number: ");
        String regdNo = sc.next();
        System.out.print("Enter Elective Subject: ");
        String electiveSubject = sc.next();
        System.out.print("Enter Average Marks: ");
        double avgMarks = sc.nextDouble();

        student.getStudentData(studentName, regdNo, electiveSubject, avgMarks);
        students.add(student);
        System.out.println("Student admitted successfully.");
    }

    public static void migrateStudent() {
        System.out.print("Enter Registration Number of Student to Migrate: ");
        String regdNo = sc.next();
        Student studentToRemove = null;

        for (Student student : students) {
            if (student.getRegdNo().equals(regdNo)) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student migrated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void displayStudentDetails() {
        System.out.print("Enter Registration Number of Student: ");
        String regdNo = sc.next();

        for (Student student : students) {
            if (student.getRegdNo().equals(regdNo)) {
                student.printStudentData();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details of a Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    admitNewStudent();
                    break;
                case 2:
                    migrateStudent();
                    break;
                case 3:
                    displayStudentDetails();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

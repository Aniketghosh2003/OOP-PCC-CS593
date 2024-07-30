package lecture1;

class student {
    int rollno;
    String name;
    float marks;

    student() {
        this(2022, "Aniket Ghosh", 6.95f);
    }

    student(int roll, String naam, float marks) {
        this.rollno = roll;
        this.name = naam;
        this.marks = marks;
    }
}

public class l1 {
    public static void main(String[] args) {
        student aniket = new student();
        // student aniket = new student(2022,"Aniket Ghosh",6.95f);
        // aniket.rollno = 2022;
        // aniket.name = "Aniket Ghosh";
        // aniket.marks = 6.95f;

        System.out.println(aniket.rollno);
        System.out.println(aniket.name);
        System.out.println(aniket.marks);
    }
}

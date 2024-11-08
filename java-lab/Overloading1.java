
//1.	Write a Java program by using method overloading to calculate area of Circle, Rectangle and Triangle.

import java.util.*;

class structure {
    void Area(int r) {
        double res = 3.14 * r * r;
        System.out.println("The area of the circle is " + res);
    }

    void Area(int l, int w) {
        int res = l * w;
        System.out.println("The area of the rectangle is " + res);
    }

    void Area(double h, double b) {
        double res = 0.50 * h * b;
        System.out.println("The area of the Triangle is " + res);
    }
}

public class Overloading1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        structure obj1 = new structure();
        structure obj2 = new structure();
        structure obj3 = new structure();

        System.out.print("\nEnter the radius of the circle :- ");
        int r = sc.nextInt();
        obj1.Area(r);
        System.out.print("\nEnter the length and width of the rectangle :- ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        obj2.Area(l, w);
        System.out.print("\nEnter the height and base for the triangle :-");
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        obj3.Area(h, b);

        sc.close();
    }
}

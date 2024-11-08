// 1. Write a program to define a
// class Fraction
// having data
// members numerator
// and denominator.
// Initialize three
// objects using
// different constructors
// and display
// its fractional value.

import java.util.*;

class fraction {
    double num;
    double deno;
    fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
        System.out.println("The value is :- " + (double)num / deno);
    }

    fraction(float num, float deno) {
        this.num = num;
        this.deno = deno;
        System.out.println("The value is :- " + num / deno);
    }

    fraction(double num, double deno) {
        this.num = num;
        this.deno = deno;
        System.out.println("The value is :- " + num / deno);
    }
}

public class Constractor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first type :- ");
        int num1 = sc.nextInt();
        int deno1 = sc.nextInt();
        fraction obj1 = new fraction(num1, deno1);
        System.out.print("Enter the second type :- ");
        float num2 = sc.nextFloat();
        float deno2 = sc.nextFloat();
        fraction obj2 = new fraction(num2, deno2);
        System.out.print("Enter the third type :- ");
        double num3 = sc.nextDouble();
        double deno3 = sc.nextDouble();
        fraction obj3 = new fraction(num3, deno3);
    }
}

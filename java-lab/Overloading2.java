//2. Write a program to calculate sum of all the elements present in an integer array and that of double array by using method overloading concept.

import java.util.*;

class array {
    void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the integer array is :- " + sum);
    }

    void sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the double array is :- " + sum);
    }
}

public class Overloading2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        array obj = new array();

        System.out.print("\nEnter the length of the integer array :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter the elements of the integer array :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        obj.sum(arr);

        System.out.print("\nEnter the number of elements in the double array :- ");
        int m = sc.nextInt();
        double[] doubleArr = new double[m];
        System.out.print("\nEnter the elements of the double array :- ");
        for (int i = 0; i < m; i++) {
            doubleArr[i] = sc.nextDouble();
        }
        obj.sum(doubleArr);

        sc.close();
    }
}

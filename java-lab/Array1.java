// 1.	Write a function named "rotate right" that takes as its arguments the following: (1) an array of floating point values; (2) an integer that tells the number of cells in the array; The function should shift the contents of each cell one place to the right, except for the contents of the last cell, which should be moved into the cell with subscript 0. Thus, for example, if the array passed to the function looks like this: 
//   0      1      2      3      4 
//  5.8 | 2.6 | 9.1 | 3.4 | 7.0 
// then when the function returns, the array will have been changed so that it looks like this: 
//   0     1      2      3      4
//  7.0 | 5.8 | 2.6 | 9.1 | 3.4   
// The function should not return a value.

import java.util.*;

public class Array1 {
    void rotateright(int[] arr,int n) {
        
        int temp = arr[n - 1];

        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of elements :- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("\nEnter the elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nOriginal Array is :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

        Array1 obj = new Array1();
        obj.rotateright(arr,n);

        System.out.print("\nNew Array is :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

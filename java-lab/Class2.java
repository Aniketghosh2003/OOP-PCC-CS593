
// 2.	Write a program using object oriented approach to find out the Fibonacci series of n terms.
import java.util.*;

class fibonacci {
    int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}

public class Class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibonacci obj = new fibonacci();

        System.out.println("Enter the number elements in the fibonacci series :- ");

        int n = sc.nextInt();
        System.out.println("The series is :- ");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(obj.fibo(i) + " ");
        }

    }
}


// 3.	Write a program using object oriented programming approach to find out all prime numbers between 1 to 100.
import java.util.*;

class prime {
    boolean isprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Class3 {
    public static void main(String[] args) {

        prime obj = new prime();

        System.out.println("The series is :- ");
        for (int i = 1; i <= 100; i++) {
            if (obj.isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

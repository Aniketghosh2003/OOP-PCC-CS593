
// 1.	Write a program using object oriented programming approach to find out factorial of any number.
import java.util.Scanner;
import java.util.*;

class factorial {
    int fact(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}

public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorial obj = new factorial();
        
        System.out.println("Please Enter the number : ");
        int temp = sc.nextInt();
        int res = obj.fact(temp);
        System.out.println("The factorial of the number is : "+ res);
        
    }
}

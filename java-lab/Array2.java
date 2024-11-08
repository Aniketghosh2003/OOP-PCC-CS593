// 2.Create a class called ArrSequence and write a method called find() to find the longest consecutive elements sequence from a given unsorted array of integers. Also find it’s length.
//Sample array: [49, 1, 3, 200, 2, 4, 70, 5] 
//The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5

import java.util.*;
import java.util.Arrays;

class ArrSequence {

    int find(int[] arr) {
        if (arr.length == 0)
            return 0;
        int n = arr.length;

        Arrays.sort(arr);

        int maxi = -999999;
        int cnt = 1;

        int i = 1;
        while (i < n) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == (arr[i - 1] + 1)) {
                    cnt++;
                } else {
                    maxi = Math.max(maxi, cnt);
                    cnt = 1;
                }
            }
            i++;
        }
        return maxi;
    }
}

public class Array2 {
    public static void main(String[] args) {
        int[] arr = { 49, 1, 3, 200, 2, 4, 70, 5 };

        ArrSequence obj = new ArrSequence();
        System.out.println("The longest length is :- " + obj.find(arr));
    }
}

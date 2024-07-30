package lecture6;

import java.util.ArrayList;
import java.util.function.Consumer;

import lecture5.son;

public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // arr.forEach((item) -> System.out.println(item * 2));
        // Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        // arr.forEach(fun);

        operartion sum = (a, b) -> a + b;
        operartion prod = (a, b) -> a * b;
        operartion sub = (a, b) -> a - b;

        lambda a = new lambda();
        System.out.println(a.operate(3, 5, sub));
    }

    private int operate(int a, int b, operartion op) {
        return op.operartion(a, b);
    }
}

/**
 * operartion
 */
interface operartion {
    int operartion(int a, int b);

}

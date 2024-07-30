package lecture7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class mian {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new LinkedList<>();

        lst2.add(23);
        lst2.add(33);
        lst2.add(45);

        // System.out.println(lst2);

        List<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(101);
        vector.add(102);

        System.out.println(vector);
    }
}

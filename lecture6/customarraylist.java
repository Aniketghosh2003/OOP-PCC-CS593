package lecture6;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.Arrays;

public class customarraylist {
    private int[] data;
    private static int Default_size = 10;
    private int size = 0;

    public customarraylist() {
        this.data = new int[Default_size];
    }

    public void add(int num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isfull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "customarraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size + '}';
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        // list.add(50);
        // list.remove(0);
        // list.get(0);
        customarraylist list = new customarraylist();

        list.add(30);
        list.add(50);
        list.add(60);
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(30);
        list.add(50);
        list.add(60);

        System.out.println(list);
    }
}

package lecture6;

import java.util.Arrays;

public class customarraylistgen<T> {
    private Object[] data;
    private static int Default_size = 10;
    private int size = 0;

    public customarraylistgen() {
        this.data = new Object[Default_size];
    }

    public void add(T num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isfull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "customarraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size + '}';
    }

    public static void main(String[] args) {

        // customarraylistgen<Integer> list = new customarraylistgen<>();
        // list.add(68);
        // list.add(69);
        // list.add(70);
        // System.out.println(list);

        customarraylistgen<String> list1 = new customarraylistgen<>();

        list1.add("Aniket");
        System.out.println(list1);
    }
}

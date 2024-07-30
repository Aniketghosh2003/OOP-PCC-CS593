package lectures2;

public class Static {
    static int a = 5;
    static int b;

    static {// it will only be called once when the first object is created
        System.out.println("value of a is " + a);
        b = a * 5;

    }

    public static void main(String[] args) {
        Static obj = new Static();
        System.out.println("Value is " + obj.a + " " + obj.b);

        Static.b += 3;

        Static obj1 = new Static();
        System.out.println("Value is " + obj.a + " " + obj.b);
    }
}

//1.	Write a program to create two threads, one prints “HELLO” and other prints “HI”.
class Hithread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HI");
        }try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Hellothread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Multithreading1 {
    public static void main(String[] args) {
        Hithread obj1 = new Hithread();
        Hellothread obj2 = new Hellothread();

        obj1.run();
        obj2.run();
    }
}

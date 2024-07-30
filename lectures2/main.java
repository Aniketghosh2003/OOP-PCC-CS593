package lectures2;

public class main {
    public static void main(String[] args) {
        // System.out.println("hello world");

        // human aniket = new human(21, "Aniket", 0.0f, false);
        // human arnab = new human(20,"Arnab", 0.0f, false);
        // System.out.println(human.population);
        // System.out.println(human.population);

        // greeting();
        fun();
    }

    static void fun() {
        //System.out.println("fuck off !!!");

        main obj = new main();
        obj.greeting();
    }

    // static void greeting() {
    // System.out.println("Hello world");
    // }

    void greeting(){
    System.out.println("Hello world");
    }
    //  it will not work because we can not use non-static things ,in stactic
    // things.

}

class A {
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        // super.finalize();
    }
}
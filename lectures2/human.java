package lectures2;

public class human {
    int age;
    String name;
    float salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("I am a Human.");
        // System.out.println(this.age);this can not be used in a static function
    }

    public human(int age, String name, float salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population += 1;
    }
}

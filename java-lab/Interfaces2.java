// 2.Create an interface called Player. The interface has an abstract method called play() that displays a message describing the meaning of “play” to the class. Create classes called Child, Musician, and Actor that all implement Player. Create an application that demonstrates the use of the classes.

import java.util.*;

interface Player {
    void play();
}

class Child implements Player {
    @Override
    public void play() {
        System.out.println("The child playes with the sand .");
    }
}

class Musician implements Player {
    @Override
    public void play() {
        System.out.println("Musician playes song with various instrument .");
    }
}

class Actor implements Player {
    @Override
    public void play() {
        System.out.println("Actor playes in a movie");
    }
}

public class Interfaces2 {
    public static void main(String[] args) {
        Musician obj1 = new Musician();
        Child obj2 = new Child();
        Actor obj3 = new Actor();
        obj1.play();
        obj2.play();
        obj3.play();
    }
}

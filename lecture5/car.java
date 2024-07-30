package lecture5;

public class car implements engine, brake {
    @Override
    public void brake() {
        System.out.println("I brake like a normal");
    }

    @Override
    public void start() {
        System.out.println("engine starts!!!");
    }

    @Override
    public void stop() {
        System.out.println("engine stops !!!");
    }

    @Override
    public void access() {
        System.out.println("you can access the engine !!!");
    }
}

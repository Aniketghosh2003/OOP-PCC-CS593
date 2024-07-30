package lecture6;

public class cloning implements Cloneable{
    int age;
    String name;

    public cloning(int age,String name){
           this.age = age;
           this.name = name;
    }

    public cloning(cloning other) {
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

package lecture4;

public class objclass {

    int num;

    objclass(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        objclass obj1 = new objclass(25);
        objclass obj2 = new objclass(25);
        // System.out.println(obj1.hashCode());

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        } // nothing will print

        System.out.println(obj1 instanceof Object);
        System.out.println(obj1.getClass().getName());
    }
}

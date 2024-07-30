package lecture6;

public class main {
    // implements genericinterfaces<Integer>
    public static void main(String[] args) throws CloneNotSupportedException {
        // student aniket = new student(3, 97.7f);
        // student rahul = new student(13, 90.9f);

        // if (aniket.compareTo(rahul) > 0) {
        // System.out.println("Aniket got better number !!!");
        // }

        cloning aniket = new cloning(22, "aniket ghosh");
        // cloning twin = new cloning(aniket);

        cloning twin = (cloning) aniket.clone();
        System.out.println(twin.age + " " + twin.name);
    }

    // // Arrays.sort(list,(o1,o2) -> -(int)(o1.marks - o2.marks)) LAMBDA
    // expressions
    // @Override
    // public void display(Integer value) {

    // }
}

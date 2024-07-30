package lectures2;

// static class A{
//     String name;
//     public A(String name){
//         this.name = name;
//     }
// }

public class innerclasses {
    static class A {
        String name;

        public A(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    // class A{
    // String name;
    // public A(String name){
    // this.name = name;
    // }
    // }

    // static class A{
    // String name;
    // public A(String name){
    // this.name = name;
    // }
    // }

    public static void main(String[] args) {
        A a = new A("aniket");

        System.out.println(a);
    }
}

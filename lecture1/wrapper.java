package lecture1;

public class wrapper {

    // with the wrapper class , we can create object of the primitive variables
    // in java when normal primitive variable used they are only passed by value in
    // the function
    // if pass the object then it will be pass by reference in the function
    //then also values will not change because it is final values of the variables
    //final keyword used for the constant values of the variables , we can not change it.
    //final variables should be inisialized when it is declared. 

    public static void main(String[] args) {
        // int a = 15;
        // int b = 20;
        // swap(a,b);
        // System.out.println(a +" "+b);
        // output - 15 20

        Integer a = 20;
        Integer b = 25;

        swap(a, b);
        System.out.println(a + " " + b);

    }

    // static void swap(int a,int b){
    // int temp = a;
    // a = b;
    // b = temp;
    // }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

package lecture6;

import lecture5.son;

public class exceptionhadling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(a, b); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("fuck you!!!");
        }

    }
    static int divide(int a,int b){
        return (int)(a/b);
    }
}

package lecture6;

public class demo {
    public static void main(String[] args) {
        
        try {
            throw new Exception();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        catch(Exception e){
             System.out.println("Normal exceptions");
        }
    }
}

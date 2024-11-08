//1.	Write a program to convert any primitive data type into corresponding wrapper class object
public class Wrapper {
    public static void main(String[] args) {
        // Primitive data types
        int intValue = 42;
        double doubleValue = 3.14;
        char charValue = 'A';
        boolean booleanValue = true;
        float floatValue = 9.81f;
        long longValue = 123456789L;
        short shortValue = 120;
        byte byteValue = 10;

        // Converting primitives to corresponding wrapper class objects
        Integer intObject = Integer.valueOf(intValue); 
        Double doubleObject = Double.valueOf(doubleValue); 
        Character charObject = Character.valueOf(charValue); 
        Boolean booleanObject = Boolean.valueOf(booleanValue); 
        Float floatObject = Float.valueOf(floatValue); 
        Long longObject = Long.valueOf(longValue);
        Short shortObject = Short.valueOf(shortValue);
        Byte byteObject = Byte.valueOf(byteValue); 

        
        System.out.println("Integer object: " + intObject);
        System.out.println("Double object: " + doubleObject);
        System.out.println("Character object: " + charObject);
        System.out.println("Boolean object: " + booleanObject);
        System.out.println("Float object: " + floatObject);
        System.out.println("Long object: " + longObject);
        System.out.println("Short object: " + shortObject);
        System.out.println("Byte object: " + byteObject);
    }
}

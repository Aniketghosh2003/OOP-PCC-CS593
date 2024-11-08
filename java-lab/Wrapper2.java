public class Wrapper2 {
    public static void main(String[] args) {
        // Wrapper class objects
        Integer intObject = Integer.valueOf(42);
        Double doubleObject = Double.valueOf(3.14);
        Character charObject = Character.valueOf('A');
        Boolean booleanObject = Boolean.valueOf(true);
        Float floatObject = Float.valueOf(9.81f);
        Long longObject = Long.valueOf(123456789L);
        Short shortObject = Short.valueOf((short) 120);
        Byte byteObject = Byte.valueOf((byte) 10);

        // Converting wrapper objects to corresponding primitive data types
        int intValue = intObject.intValue(); // Integer to int
        double doubleValue = doubleObject.doubleValue(); // Double to double
        char charValue = charObject.charValue(); // Character to char
        boolean booleanValue = booleanObject.booleanValue(); // Boolean to boolean
        float floatValue = floatObject.floatValue(); // Float to float
        long longValue = longObject.longValue(); // Long to long
        short shortValue = shortObject.shortValue(); // Short to short
        byte byteValue = byteObject.byteValue(); // Byte to byte

        // Displaying the primitive data types
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + booleanValue);
        System.out.println("float value: " + floatValue);
        System.out.println("long value: " + longValue);
        System.out.println("short value: " + shortValue);
        System.out.println("byte value: " + byteValue);
    }
}

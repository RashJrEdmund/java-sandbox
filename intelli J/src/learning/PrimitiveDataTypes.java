public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // VARIABLES

        // 1 BOOLEANS;
        boolean booleanLiteral = true;

        System.out.println("The boolean literal is = " + booleanLiteral);

        System.out.println("\n");

        // 2 STRINGS;
        // 2.1 Strings;
        String stringLiteral = "Rash";

        System.out.println("Hello " + stringLiteral);

        System.out.println("\n");

        // 2.2 Char;. use single quotes and can only contain a single character.
        char character = 'A';

        System.out.println("The character is = " + character);

        System.out.println("\n");

        // 3 NUMBERS
        // 3.1 Integers
        int age = 15;
        int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;

        System.out.println("The maximum integer value is = " + maxInteger);
        System.out.println("The minimum byte value is = " + minInteger);

        System.out.println("Your age is " + age);

        System.out.println("\n");

        // 3.2 Bytes
        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        System.out.println("The maximum byte value is = " + maxByteValue);
        System.out.println("The minimum byte value is = " + minByteValue);

        System.out.println("\n");

        // 3.3 Longs
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        long longLiteral = 2147483648L;

        System.out.println("The maximum long value is = " + maxLongValue);
        System.out.println("The minimum long value is = " + minLongValue);
        System.out.println("Long literal = " + longLiteral);

        System.out.println("\n");

        // 3.4 Shorts
        short maxShortVal = Short.MAX_VALUE;
        short minShortVal = Short.MIN_VALUE;

        System.out.println("The max short val is = " + maxShortVal);
        System.out.println("The min short val is = " + minShortVal);

        System.out.println("\n");

        // 3.5 Floats. Use if you need little precision
        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;
        float floatLiteral = 3.14F;

        System.out.println("The maximum float value is = " + maxFloatValue);
        System.out.println("The minimum float value is = " + minFloatValue);
        System.out.println("Float literal = " + floatLiteral);

        System.out.println("\n");

        // 3.6 Doubles. Use if you need a lot of precision
        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;
        double doubleLiteral = 3.14;

        System.out.println("The maximum double value is = " + maxDoubleValue);
        System.out.println("The minimum double value is = " + minDoubleValue);
        System.out.println("Double literal = " + doubleLiteral);
    }
}
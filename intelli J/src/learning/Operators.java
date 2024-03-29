public class Operators {
    public static void main (String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println("+ : " + (num1 + num2));
        System.out.println("- : " + (num1 - num2));
        System.out.println("* : " + (num1 * num2));
        System.out.println("/ : " + (num1 / num2));
        System.out.println("% : " + (num1 % num2));

        System.out.println("\n");

        int val1 = 5;
        int val2 = 5;

        System.out.println("Postfix decrementation " + val1--);
        System.out.println(val1);
        System.out.println("Prefix decrementation " + --val1);
        System.out.println(val1);

        System.out.println("\n");

        System.out.println("Postfix incrementation " + val2++);
        System.out.println(val2);
        System.out.println("Prefix incrementation " + ++val2);
        System.out.println(val2);
    }
}
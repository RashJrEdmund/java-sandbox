public class Functions {
    public static void main (String[] args) {
        System.out.println("My functions");

        sayHello("Rash",  22);

        int sum = sumValues(1, 2);

        System.out.println("The sum is " + sum);
    }

    public static void sayHello (String name, int age) {
        System.out.println("Hello " + name + ". You are " + age + " years old");
    }

    public static int sumValues (int val1, int val2) {
        int sum = val1 + val2;

        return sum;
    }
}
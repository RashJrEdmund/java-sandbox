import java.util.Scanner;

public class FindMax {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("WELCOME TO THE FIND MAX ALGORITHM");

        int[] values = { 1, 2, 5, 3, 4};

        System.out.println("The max value is : " + findMax(values));
    }

    public static int findMax (int[] values) {
        int max = values[0];

        for (int value : values) {
            if (value > max) max = value;
        }

        return max;
    }
}
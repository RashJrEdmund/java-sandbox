import java.util.Scanner;

public class ScanningInput {
	public static Scanner scanner = new Scanner(System.in);

	public static void main (String[] args) {
		System.out.println("What time is it?");
		int time = scanner.nextInt();

        switch (time) {
            case 6 -> System.out.println("It's time to wake up");
            case 22 -> System.out.println("It's time to sleep");
            default -> System.out.println("Ok, cool, your time is " + time);
        }
	}
}

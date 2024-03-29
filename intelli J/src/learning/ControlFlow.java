public class ControlFlow {
    public static void main (String[] args) {
        int number = 9;

        if (number == 10) {
            System.out.println("Number is equal");
        } else if (number <= 5) {
            System.out.println("The number is less than 5");
        } else if (number >= 18) {
            System.out.println("The number is similar to actual voting age");
        } else {
            System.out.println("This is the number : " + number);
        }

        System.out.println("\n");

        //
        char gender = 'M';
        int age = 18;

        if (age >= 18) {
            if (gender == 'M') {
                System.out.println("You a big boy");
            } else if (gender == 'F') {
                System.out.println("You a big girl");
            }
        }

        System.out.println("\n");

        if (gender != 'M' || gender != 'F') {
            System.out.println("What type of human are you?");
        }

        System.out.println("\n");

        // Switch case
        int time = 10;

        switch (time) {
            case 10:
                System.out.println("Your are on time. " + time + ", is the right time");
                break;
            case 12:
                System.out.println("You are " + 2 + "hrs late");
                break;
            case 8:
                System.out.println("You are " + 2 + "hrs early");
            default:
                System.out.println("whay time did you arrie");
                break;
        }

        System.out.println("\n");

        for (int i = 0; i <= 10; i++) {
            System.out.println("I = " + i);
        }

        System.out.println("\n");

        int whileVal = 0;
        while (whileVal <= 10) {
            System.out.println("whileVal is " + whileVal);
            whileVal++;
        }

        System.out.println("\n");

        do {
            System.out.println("doWhile Val is " + whileVal);
            whileVal++;
        } while(whileVal <= 15);
    }
}
public class Arrays {
    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number at index :" + i + " is " + numbers[i]);
        }

        System.out.println("\n");

        for (int number : numbers) { // like for of loop
            System.out.println("Number in for of is " + number);
        }

        System.out.println("\n");

        int[] arrIntegers = new int[5]; // declaring a array with length 5;

        arrIntegers[0] = 1;
        arrIntegers[1] = 2;
        arrIntegers[2] = 3;
        arrIntegers[3] = 4;
        arrIntegers[4] = 5;

        System.out.println(arrIntegers);
    }
}

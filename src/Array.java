import java.util.Scanner;

public class Array {
    //public static Scanner scanner = new Scanner(System.in);

    public static int[] addNumbersInArray(int[] array) {
        int number;
        System.out.print("Input number in array: ");
        for (int i = 0; i < array.length; i++) {
            number = Common.scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static void displayArray(int[] array) {
        System.out.println("Array is:");
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            System.out.println("    position - " + i + ", element - " + array[i]);
        }
    }

    public static int getMaximSize() {
        System.out.print("Input a value for array length: ");
        int maxLength;
        maxLength = Common.scanner.nextInt();
        return maxLength;
    }

    public static void ascendingSorting(int[] array) {
        int temp;
        int oldPosition, newPosition;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                oldPosition = array[i];
                temp = array[i];
                newPosition = array[i + 1];
                System.out.println("BEFORE: oldPosition " + oldPosition + " temp " + temp + " newPosition " + newPosition);
                oldPosition = newPosition;
                newPosition = temp;
                System.out.println("AFTER: oldPosition " + oldPosition + " temp " + temp + " newPosition " + newPosition);
            }
        }

    }
}

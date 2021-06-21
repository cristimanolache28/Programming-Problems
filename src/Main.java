import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //---------------------Reverse String---------------------
        System.out.print("Input String for reverse: ");
        String string = Common.scanner.nextLine();
        ReverseString.inputStringMethod(string);
        ReverseString.reverseStringMethod1(string); // call main method
        ReverseString.reverseStringMethod2(string); // call second method

        //----------------Reverse a number--------------
        System.out.print("Input number: ");
        int number = Common.scanner.nextInt();
        ReverseNumber.reverseNumber(number);

        //--------------Switch to Variables------------
        System.out.print("Input Values for swap " +
                "\n\tFirst vatiable: " );
        int nr1 = Common.scanner.nextInt();
        System.out.print("\nSecond variable: ");
        int nr2 = Common.scanner.nextInt();
        swapToVariables.swap(nr1, nr2);

        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");
        System.out.println("This is all for one day!");











        // Array (addNumber, displayArray, maximSize, sorting?)
//        int[] myArray = new int[Array.getMaximSize()];
//        Array.addNumbersInArray(myArray);
//        Array.displayArray(myArray);
//        Array.ascendingSorting(myArray);
    }

}
















































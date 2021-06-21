public class ReverseNumber {

    public static void reverseNumber(int nr) {
        int rest = 0;
        int reverse = 0;
        while (nr != 0){
            rest = nr % 10;
            reverse = reverse * 10 + rest;
            nr /= 10;
        }
        System.out.println("Reverse number: " + reverse);
    }

}

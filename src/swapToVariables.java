public class swapToVariables {

    public static void swap(int x, int y) {
        System.out.println("BEFORE: x = " + x + " y = " + y);
        x += y;
        y = x - y;
        x -= y;
        System.out.println("AFTER: x = " + x + " y = " + y);
    }
}

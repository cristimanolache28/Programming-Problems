public class ReverseString {

  private static char[] revString;

  public static String inputStringMethod(String string) {
    System.out.println("String input: " + string.toUpperCase());
    return string.toUpperCase();
  }

  public static void reverseStringMethod1(String string) {
    System.out.print("Reverse string main method: ");
    transformStringToChart(string);
    for (int i = revString.length - 1; i >= 0; i--) {
      System.out.print(revString[i]);
    }
  }

  public static void reverseStringMethod2(String string) {
    transformStringToChart(string);
    StringBuffer str = new StringBuffer(string);
    str.reverse();
    System.out.println("\nReverse string second method: " + str);
  }

  public static char[] transformStringToChart(String string) {
    revString = string.toUpperCase().toCharArray();
    return revString;
  }


}

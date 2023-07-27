public class ValidParentheses {

  public static boolean isValid(String s) {
    boolean stringIsValid = true;

    return stringIsValid;
  }

  public static void main(String[] args) {
    String test_1 = "()";
    String test_2 = "()[]{}";
    String test_3 = "(]";
    System.out.println(isValid(test_1));
    System.out.println(isValid(test_2));
    System.out.println(isValid(test_3));
 }
}

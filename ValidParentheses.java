import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

  public static boolean isValid(String s) {

      // Gets rid of easy invalid strings
      if (s.length() % 2 == 1) {
        return false;
      }

      HashMap<Character, Character> parentheses = new HashMap<Character, Character>();
      parentheses.put('(', ')');
      parentheses.put('[', ']');
      parentheses.put('{', '}');

      boolean stringIsValid = true;
      Stack<Character> parenthesesToValidate = new Stack<Character>();

      for (int index = 0; index < s.length(); index++) {

        // Runs for opening characters
        if (parentheses.containsKey(s.charAt(index))) {
          parenthesesToValidate.add(parentheses.get(s.charAt(index)));

        // Runs for closing characters
        } else if (parentheses.containsValue(s.charAt(index))) {

          // Checks if the last opening parenthese matches current closing
          if (parenthesesToValidate.empty() || parenthesesToValidate.peek() != s.charAt(index)) {
            return stringIsValid = false;
          } else {
            stringIsValid = true;
            parenthesesToValidate.pop();
          }
        }
      }

      return stringIsValid && parenthesesToValidate.empty();
  }

  public static void main(String[] args) {
    String test_1 = "()";
    String test_2 = ")(){}";
    String test_3 = "(]";
    String test_4 = "{()}";
    String test_5 = "{";
    String test_6 = "]";
    String test_7 = "([]";
    String test_8 = "){";

    System.out.print("True ");
    System.out.println(isValid(test_1));

    System.out.print("False ");
    System.out.println(isValid(test_2));

    System.out.print("False ");
    System.out.println(isValid(test_3));

    System.out.print("True ");
    System.out.println(isValid(test_4));

    System.out.print("False ");
    System.out.println(isValid(test_5));

    System.out.print("False ");
    System.out.println(isValid(test_6));

    System.out.print("False ");
    System.out.println(isValid(test_7));

    System.out.print("False ");
    System.out.println(isValid(test_8));
 }
}

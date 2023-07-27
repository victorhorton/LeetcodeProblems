import java.util.HashMap;

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
      char[] parenthesesToValidate = new char[s.length()];
      int parenthesesToValidateIndex = 0;

      int openingCharacters = 0;
      int closingCharacters = 0;

      for (int index = 0; index < s.length(); index++) {

        // Runs for opening characters
        if (parentheses.containsKey(s.charAt(index))) {
          openingCharacters++;
          stringIsValid = false;

          // Adds opening parentheses to array to be checked later
          parenthesesToValidate[parenthesesToValidateIndex] = s.charAt(index);
          parenthesesToValidateIndex++;

        // Runs for closing characters
        } else if (parentheses.containsValue(s.charAt(index)) && parenthesesToValidateIndex > 0) {
          closingCharacters++;
          parenthesesToValidateIndex--;

          // Checks if the last opening parenthese matches current closing
          if (parentheses.get(parenthesesToValidate[parenthesesToValidateIndex]) != s.charAt(index)) {
            stringIsValid = false;
            break;
          } else {
            stringIsValid = true;
          }
        // Runs for non-parentheses characters
        } else {
          stringIsValid = false;
          break;
        }
      }

      return stringIsValid && openingCharacters == closingCharacters;
  }

  public static void main(String[] args) {
    String test_1 = "()";
    String test_2 = ")(){}";
    String test_3 = "(]";
    String test_4 = "{()}";
    String test_5 = "{";
    String test_6 = "]";
    String test_7 = "([]";

    System.out.println(isValid(test_1));
    System.out.println(isValid(test_2));
    System.out.println(isValid(test_3));
    System.out.println(isValid(test_4));
    System.out.println(isValid(test_5));
    System.out.println(isValid(test_6));
    System.out.println(isValid(test_7));
 }
}

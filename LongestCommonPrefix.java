import java.util.Arrays;

public class LongestCommonPrefix {

  public static String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    String first_string = strs[0];
    String last_string = strs[strs.length - 1];
    int char_idx = 0;

    while (first_string.length() > char_idx && last_string.length() > char_idx) {
      if (first_string.charAt(char_idx) == last_string.charAt(char_idx)) {
        char_idx++;
      } else {
        break;
      }
    }

    return first_string.substring(0, char_idx);
  }

  public static void main(String[] args) {
    String[] arg1 = {"dog","racecar","car"};
    String[] arg2 = {"racecar","racecars"};
    String[] arg3 = {"flower","flow","flight"};
    String[] arg4 = {"a"};
    System.out.println(longestCommonPrefix(arg1));
    System.out.println(longestCommonPrefix(arg2));
    System.out.println(longestCommonPrefix(arg3));
    System.out.println(longestCommonPrefix(arg4));
 }
}

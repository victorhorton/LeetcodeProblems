public class ClimbingStairs {

  public static int climbStairs(int n) {
    // Sets up Fibnacci's sequence
    int leading_value = 1;
    int trailing_value = 1;

    // Calculates sequence n - 1 times
    for (int i = 0; i < n - 1; i++) {
      int temp_one = leading_value;
      leading_value += trailing_value;
      trailing_value = temp_one;
    }

    // Returns the value of the nth - 1 calculation
    return leading_value;

    /*
      Fibnacci's sequence
      1 1 2 3 5 8 13 21 34...
      First Calculation   1 + 1   = 2
      Second Calculation  1 + 2   = 3
      Third Calculation   2 + 3   = 5
      Fourth Calculation  3 + 5   = 8
      Fifth Calculation   5 + 8   = 13
      Sixth Calculation   8 + 13  = 21
      Seventh Calculation 13 + 21 = 34
      ...
    */
  }

  public static void main(String[] args) {

    int test_1 = 2;
    int test_2 = 3;
    int test_3 = 5;
    int test_4 = 10;

    System.out.println(climbStairs(test_1));
    System.out.println(climbStairs(test_2));
    System.out.println(climbStairs(test_3));
    System.out.println(climbStairs(test_4));
 }
}

class SearchInsert {

  public static int searchInsert(int[] nums, int target) {
    int start_index = 0;
    int end_index = nums.length - 1;

    while (start_index < end_index) {

      // Resets middle of for every loop
      int middle_index = (start_index + end_index) / 2;


      if (nums[middle_index] == target) {

        // Return index of value if in array
        return middle_index;
      } else if (nums[middle_index] < target) {

        // Sets new start index to middle index
        start_index = middle_index + 1;
      } else {

        // Sets new end index to middle index
        end_index = middle_index - 1;
      }
    }

    // Sets middle_index var ourside of while loop
    int middle_index = (start_index + end_index) / 2;

    // Sets index where target would be
    if (nums[middle_index] < target) {
      return middle_index + 1;
    }

    return middle_index;
  }

  public static void main(String[] args) {
    int[] test_1_array = {1,3,5,6};
    int test_1_target = 2;

    int[] test_2_array = {1,3,5,6,7,8};
    int test_2_target = 5;

    int[] test_3_array = {1,2,3,5,6,8};
    int test_3_target = 7;

    System.out.print("1 = ");
    System.out.println(searchInsert(test_1_array, test_1_target));
    System.out.print("2 = ");
    System.out.println(searchInsert(test_2_array, test_2_target));
    System.out.print("5 = ");
    System.out.println(searchInsert(test_3_array, test_3_target));
  }
}

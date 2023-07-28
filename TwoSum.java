import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] original_array = nums.clone();
        Arrays.sort(nums);

        int left_index = 0;
        int right_index = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[left_index] + nums[right_index] > target) {
                right_index--;
            } else if (nums[left_index] + nums[right_index] < target) {
                left_index++;
            } else {
                break;
            }
        }

        int[] final_result = new int[2];
        int next_array_index = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[left_index] == original_array[index]) {
                final_result[next_array_index] = index;
                next_array_index++;
            } else if (nums[right_index] == original_array[index]) {
                final_result[next_array_index] = index;
                next_array_index++;
            }
        }

        return final_result;
    }

  public static void main(String[] args) {

    int[] array_test_1 = new int[] {2,5,5,11};
    int result_test_1 = 10;

    int[] result_array = twoSum(array_test_1, result_test_1);

    for (int i = 0; i < result_array.length; i++) {
        System.out.println(result_array[i]);
    }
 }
}

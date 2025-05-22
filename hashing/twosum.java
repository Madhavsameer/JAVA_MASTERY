import java.util.HashSet;
import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 7, 9};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Pair found: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found.");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int rem = target - num;
            if (set.contains(rem)) {
                return new int[]{rem, num}; // return the actual pair
            }
            set.add(num);
        }

        return null;
    }
}

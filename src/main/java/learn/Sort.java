package learn;

import java.util.Random;

public class Sort {

    public static void populate(int[] nums) {
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt();
        }
    }

    public static void sort(int[] nums) {
        assert nums[0] <= nums[1];
        if (false) {
            int temp = nums[0];
            temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
    }

    public static void print(String message, int[] nums) {
        System.out.println();
        System.out.println(message);
        for (int num: nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[2];
        populate(nums);
        print("Before sorting:", nums);
        sort(nums);
        print("After sorting:", nums);
    }
}

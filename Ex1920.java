package Homework1;

import java.util.Arrays;

public class Ex1920 {
    public static void main(String[] args) {
        int[] nums = new int[] { 5, 0, 1, 2, 3, 4 };
        buildArray(nums);
    }

    public static void buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(nums));
    }
}

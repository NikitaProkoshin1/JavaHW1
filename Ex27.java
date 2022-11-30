package Homework1;

import java.util.Arrays;

public class Ex27 {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2 };
        int val = 2;
        removeElement(nums, val);
    }

    public static void removeElement(int[] nums, int val) {
        int k = 0;
        if (nums.length != 0) {
            k = nums.length;
            for (int i = 0; i < k; i++) {
                if (nums[i] == val) {
                    while (nums[k - 1] == val && k - 1 > i) {
                        k--;
                    }
                    nums[i] = nums[k - 1];
                    nums[k - 1] = val;
                    k--;
                }
            }
        }
        System.out.printf("k = %s ", k);
        System.out.println(Arrays.toString(nums));
    }
}

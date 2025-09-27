package com.logic;

import java.util.Arrays;

public class AppendZeroToEnd {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 0;
        nums[1] = 2;
        nums[2] = 0;
        nums[3] = 4;
        nums[4] = 5;
        appendZeroToEnd(nums);
    }

    private static void appendZeroToEnd(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

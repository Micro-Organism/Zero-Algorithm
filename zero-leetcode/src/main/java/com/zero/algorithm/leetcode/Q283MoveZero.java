package com.zero.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author rabbit
 * @description 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * @createTime 2024/4/16 下午6:04
 */
public class Q283MoveZero {

    public static void moveZeroes(int[] nums) {
        int number = 0;
        for (int index = 0; index < nums.length; index ++) {
            if(nums[index] != 0) {
                nums[number] = nums[index];
                if(number != index){
                    nums[index] = 0;
                }
                number ++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes02(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}

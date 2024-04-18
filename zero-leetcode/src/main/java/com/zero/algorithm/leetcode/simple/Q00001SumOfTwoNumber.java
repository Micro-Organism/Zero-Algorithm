package com.zero.algorithm.leetcode.simple;

/**
 * @author rabbit
 * @level  Simple
 * @description 1.两数之和
 * @createTime 2024/4/12 下午1:58
 */
public class Q00001SumOfTwoNumber {

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[]{0,0};
        for(int index = 0; index < nums.length; index++){
            for(int number = index + 1; number < nums.length; number++ ){
                if(nums[index]+nums[number] == target){
                    res[0] = index;
                    res[1] = number;
                    break;
                }
            }
        }
        return res;
    }

}

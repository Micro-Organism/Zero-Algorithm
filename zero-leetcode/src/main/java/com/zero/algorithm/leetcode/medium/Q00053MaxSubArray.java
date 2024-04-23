package com.zero.algorithm.leetcode.medium;

/**
 * @author rabbit
 * @level Medium
 * @description 最大子数组和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组是数组中的一个连续部分。
 * @createTime 2024/4/18 上午9:50
 */
public class Q00053MaxSubArray {

    public static int maxSubArray01(int[] nums) {
        int len = nums.length;
        // dp[i] 表示：以 nums[i] 结尾的连续子数组的最大和
        int[] dp = new int[len];
        dp[0] = nums[0];

        for (int index = 1; index < len; index++) {
            if (dp[index - 1]>0) {
                dp[index] = dp[index - 1] + nums[index];
            }
            else {
                dp[index] = nums[index];
            }
        }

        // 也可以在上面遍历的同时求出 res 的最大值，这里我们为了语义清晰分开写
        int res = dp[0];
        for (int index = 0; index < len; index++) {
            res = Math.max(res, dp[index]);
        }

        return res;
    }

}

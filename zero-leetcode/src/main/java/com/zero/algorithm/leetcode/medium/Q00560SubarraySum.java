package com.zero.algorithm.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rabbit
 * @level Medium
 * @description 和为K的子数组
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
 * 子数组是数组中元素的连续非空序列。
 * @createTime 2024/4/18 上午9:41
 */
public class Q00560SubarraySum {

    /**
     * 参考代码 1: 暴力解法（超时）
     * 枚举左右边界（超时）
     * @param nums  数组
     * @param k 比值
     * @return 次数
     */
    public static int subarraySum01(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {

                int sum = 0;
                for (int i = left; i <= right; i++) {
                    sum += nums[i];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 参考代码 2: 暴力解法的优化
     * 固定了起点，即先固定左边界，然后枚举右边界哈，时间复杂度降了一维。
     * @param nums  数组
     * @param k 比值
     * @return 次数
     */
    public static int subarraySum02(int[] nums, int k) {
        int count = 0;
        int len = nums.length;
        for (int left = 0; left < len; left++) {
            int sum = 0;
            // 区间里可能会有一些互相抵销的元素
            for (int right = left; right < len; right++) {
                sum += nums[right];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 参考代码 3: 前缀和算法
     * @param nums  数组
     * @param k 比值
     * @return 次数
     */
    public static int subarraySum03(int[] nums, int k) {
        int length = nums.length;
        //计算前缀和数组
        int[] preSum = new int[length + 1];
        preSum[0] = 0;
        for (int index = 0; index < length; index++) {
            preSum[index + 1] = preSum[index] + nums[index];
            System.out.println(preSum[index + 1] + "=" + preSum[index] + "+" + nums[index]);
        }
        //打印下前缀和
        System.out.println(Arrays.toString(preSum));

        int count = 0;
        for (int left = 0; left < length; left++) {
            for (int right = 0; right < length; right++) {
                //区间和 [left..right]，注意下标偏移
                System.out.println(preSum[right + 1] + "-" + preSum[left] + "==" + k);
                if(preSum[right + 1] - preSum[left] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 参考代码 4: 前缀和哈希优化
     * @param nums  数组
     * @param k 比值
     * @return 次数
     */
    public static int subarraySum04(int[] nums, int k) {
        // key：前缀和，value：key 对应的前缀和的个数
        Map<Integer, Integer> preSumFreq = new HashMap<>();
        // 对于下标为 0 的元素，前缀和为 0，个数为 1
        preSumFreq.put(0, 1);

        int preSum = 0;
        int count = 0;
        for (int num : nums) {
            preSum += num;

            // 先获得前缀和为 preSum - k 的个数，加到计数变量里
            if (preSumFreq.containsKey(preSum - k)) {
                count += preSumFreq.get(preSum - k);
            }

            // 然后维护 preSumFreq 的定义
            preSumFreq.put(preSum, preSumFreq.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }

}

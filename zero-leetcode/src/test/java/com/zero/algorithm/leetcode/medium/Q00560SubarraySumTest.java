package com.zero.algorithm.leetcode.medium;

import org.junit.jupiter.api.Test;

import static com.zero.algorithm.leetcode.medium.Q00560SubarraySum.*;

/**
 * @author rabbit
 * @description 和为K的子数组
 * @createTime 2024/4/23 下午2:31
 */
public class Q00560SubarraySumTest {

    @Test
    void test01() {
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int res = subarraySum01(nums, k);
        System.out.println(res);
    }

    @Test
    void test02() {
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int res = subarraySum02(nums, k);
        System.out.println(res);
    }

    @Test
    void test03() {
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int count = subarraySum03(nums, k);
        System.out.println(count);
    }

    @Test
    void test04() {
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int count = subarraySum04(nums, k);
        System.out.println(count);
    }

}

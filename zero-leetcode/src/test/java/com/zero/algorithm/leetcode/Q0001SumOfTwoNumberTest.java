package com.zero.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.zero.algorithm.leetcode.Q0001SumOfTwoNumber.twoSum;

/**
 * @author rabbit
 * @description 1.两数之和
 * @createTime 2024/4/12 下午1:58
 */
public class Q0001SumOfTwoNumberTest {

    @Test
    void test() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}

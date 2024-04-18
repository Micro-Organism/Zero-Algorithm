package com.zero.algorithm.leetcode.simple;

import org.junit.jupiter.api.Test;

import static com.zero.algorithm.leetcode.simple.Q00283MoveZero.moveZeroes02;

/**
 * @author rabbit
 * @level  Simple
 * @description
 * @createTime 2024/4/16 下午6:13
 */
public class Q00283MoveZeroTest {

    @Test
    void test() {
//        int[] nums = new int[]{0,1,0,3,12};
        int[] nums = new int[]{2,1};

//        moveZeroes(nums);

        moveZeroes02(nums);
    }

}

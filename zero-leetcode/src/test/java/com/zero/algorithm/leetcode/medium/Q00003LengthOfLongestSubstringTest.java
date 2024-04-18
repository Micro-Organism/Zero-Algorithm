package com.zero.algorithm.leetcode.medium;

import org.junit.jupiter.api.Test;

import static com.zero.algorithm.leetcode.medium.Q00003LengthOfLongestSubstring.*;

/**
 * @author rabbit
 * @level Medium
 * @description
 * @createTime 2024/4/17 下午2:49
 */
public class Q00003LengthOfLongestSubstringTest {

    @Test
    void test01() {
        int temp = lengthOfLongestSubstring01("dvdf");
        System.out.println(temp);
    }

    @Test
    void test02() {
        int temp = lengthOfLongestSubstring02("dvdf");
        System.out.println(temp);
    }

    @Test
    void test03() {
        int temp = lengthOfLongestSubstring03("dvdf");
        System.out.println(temp);
    }
}

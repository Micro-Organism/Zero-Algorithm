package com.zero.algorithm.leetcode.medium;

import java.util.*;

/**
 * @author rabbit
 * @level Medium
 * @description 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
 * @createTime 2024/4/17 下午2:30
 */
public class Q0003LengthOfLongestSubstring {

    /**
     * 方法一
     * @param s 测试字符串
     * @return  返回值
     */
    public static int lengthOfLongestSubstring01(String s) {

        //声明返回结果
        int result = 0;
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int pointRight = -1;
        //需要记录一下滑块的数据 哈希集合，记录每个字符是否出现过
        Set<Character> slider = new HashSet<>();
        //遍历循环
        for (int pointLeft = 0; pointLeft < s.length(); pointLeft++) {
            if (pointLeft != 0) {
                //左指针向右移动一格，移除一个字符
                slider.remove(s.charAt(pointLeft - 1));
            }
            while (pointRight + 1 < s.length() && !slider.contains(s.charAt(pointRight + 1))) {
                //不断移动右侧指针
                slider.add(s.charAt(pointRight + 1));
                pointRight ++;
            }
            //第 pointLeft 到 pointRight 个字符是一个机场的无重复字符字串
            result = Math.max(result, pointRight - pointLeft + 1);
        }
        return result;
    }

    /**
     * 方法二
     * @param s 测试字符串
     * @return  返回值
     */
    public static int lengthOfLongestSubstring02(String s) {
        //声明返回结果
        int result = 0;
        //定义左指针
        int pointLeft = -1;
        //需要记录一下滑块的数据
        HashMap<Character, Integer> slider = new HashMap<>();
        //遍历循环
        for (int pointRight = 0; pointRight < s.length(); pointRight++) {
            if(slider.containsKey(s.charAt(pointRight))){
                //更新左指针
                pointLeft = Math.max(pointLeft, slider.get(s.charAt(pointRight)));
            }
            slider.put(s.charAt(pointRight), pointRight);
            result = Math.max(result, pointRight - pointLeft);
        }
        //返回结果
        return result;
    }

    /**
     * 方法二
     * @param s 测试字符串
     * @return  返回值
     */
    public static int lengthOfLongestSubstring03(String s) {
        //声明返回结果
        int result = 0;
        //定义中间值
        int temp = 0;
        //定义滑块
        Map<Character, Integer> slider = new HashMap<>();
        //遍历循环
        for (int index = 0; index < s.length(); index++) {
            //获取索引 cursor 代表当哈希表包含键 key 时返回对应 value ，不包含时返回默认值 default
            int cursor = slider.getOrDefault(s.charAt(index), -1);
            //更新哈希表
            slider.put(s.charAt(index), index);
            //转移方程 dp[index - 1] -> dp[index]
            temp = temp < index - cursor ? temp + 1 : index - cursor;
            //获取最大值 max(dp[index - 1], dp[index])
            result = Math.max(result, temp);
        }
        //返回结果
        return result;
    }

}

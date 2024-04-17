package com.zero.algorithm.leetcode.simple;

/**
 * @author rabbit
 * @level Simple
 * @description 环形链表
 * @createTime 2024/4/17 下午4:58
 */
public class Q0141HasCycle {

    /**
     *  Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean hasCycle(ListNode head) {
        return true;
    }

}

package com.zero.algorithm.leetcode.simple;

/**
 * @author rabbit
 * @level Simple
 * @description 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * @createTime 2024/4/17 下午5:04
 */
public class Q0206ReverseList {

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

    public ListNode reverseList(ListNode head) {

        ListNode listNode = new ListNode();
        return listNode;
    }

}

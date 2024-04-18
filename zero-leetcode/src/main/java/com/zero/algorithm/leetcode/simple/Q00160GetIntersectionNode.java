package com.zero.algorithm.leetcode.simple;

/**
 * @author rabbit
 * @level Simple
 * @description 相交链表
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null 。
 * @createTime 2024/4/17 下午5:00
 */
public class Q00160GetIntersectionNode {

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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode listNode = new ListNode();
        return listNode;
    }

}

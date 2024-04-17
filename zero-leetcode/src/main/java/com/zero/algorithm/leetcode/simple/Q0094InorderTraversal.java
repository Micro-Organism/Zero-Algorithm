package com.zero.algorithm.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rabbit
 * @level Simple
 * @description 二叉树的中序遍历
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 * @createTime 2024/4/17 下午4:42
 */

public class Q0094InorderTraversal {

    /**
     * Definition for a binary tree node.
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        return result;

    }

}

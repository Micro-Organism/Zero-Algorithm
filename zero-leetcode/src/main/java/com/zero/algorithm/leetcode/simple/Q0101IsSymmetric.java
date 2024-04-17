package com.zero.algorithm.leetcode.simple;

/**
 * @author rabbit
 * @level Simple
 * @description 对称二叉树
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * @createTime 2024/4/17 下午4:48
 */
public class Q0101IsSymmetric {

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
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

    public boolean isSymmetric(TreeNode root) {
        return true;
    }

}

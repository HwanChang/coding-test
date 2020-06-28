package com.leetcode.june;

public class Sum_Root_to_Leaf_Numbers {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int sumNumbers(TreeNode root) {
        int sum = 0;
        return findNumbers(root, sum);
    }

    public static int findNumbers(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        sum = (sum * 10) + root.val;

        if (root.left == null && root.right == null) {
            return sum;
        }

        return findNumbers(root.left, sum) + findNumbers(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(0), null);
//        TreeNode root = new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0, new TreeNode(3), null));

        int answer = sumNumbers(root);
        System.out.println(answer);
    }
}

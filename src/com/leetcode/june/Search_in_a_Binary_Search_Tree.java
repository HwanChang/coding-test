package com.leetcode.june;


class TreeNode {
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

public class Search_in_a_Binary_Search_Tree {

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        if(root.val < val) {
            return searchBST(root.right, val);
        } else if(root.val > val) {
            return searchBST(root.left, val);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode answer = searchBST(root, 5);
        System.out.println(answer.val + " | " + answer.left.val + " | " + answer.right.val);
    }
}

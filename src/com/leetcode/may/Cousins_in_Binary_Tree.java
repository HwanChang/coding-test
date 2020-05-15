package com.leetcode.may;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

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

// May07
public class Cousins_in_Binary_Tree {

    // 수정 전 : 재귀함수 사용 하지 않고 큐 사용 하면 0ms 대로 실행 가능.
    // Runtime: 3 ms
    // Memory Usage: 38 MB
    public static boolean isCousins(TreeNode root, int x, int y) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(root.val, 1);
        if(findTreeNode(root, map, 1, x, y) == null) {
            return false;
        }

        if(map.get(x).equals(map.get(y))) {
            int count = 0;
            for(Map.Entry entry : map.entrySet()) {
                if(map.get(x)-1 == (int)entry.getValue()) {
                    count++;
                }
            }
            return count != 1;
        } else {
            return false;
        }
    }

    public static HashMap<Integer, Integer> findTreeNode(TreeNode node, HashMap<Integer, Integer> map, int depth, int x, int y) {
        int val = node.val;
        TreeNode left = node.left;
        TreeNode right = node.right;

        if(left != null && right != null) {
            if ((left.val == x || left.val == y) && (right.val == x | right.val == y)) {
                return null;
            }
        }

        map.put(val, depth);
        if(left != null) {
            int leftVal = left.val;
            map.put(leftVal, depth);
            if(findTreeNode(left, map, depth+1, x, y) == null) return null;
        }
        if(right != null) {
            int rightVal = right.val;
            map.put(rightVal, depth);
            if(findTreeNode(right, map, depth+1, x, y) == null) return null;
        }

        return map;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        int x = 4;
        int y = 5;
        boolean answer = isCousins(root, x, y);
        System.out.println(answer);
    }
}

package com.leetcode.editor.cn.config;

/**
 * @Author: Evan
 * @CreateTime: 2020-04-08
 * @Description:
 */
public class ListNode {
    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}

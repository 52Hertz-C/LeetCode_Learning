package com.leetcode.editor.cn;

//将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表


import com.leetcode.editor.cn.config.ListNode;

import java.util.Arrays;

public class T21{

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(4);


        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);
        l2.next.next.next = new ListNode(2);
        l2.next.next.next.next = new ListNode(1);

        mergeTwoLists(null,null);
    }
    
//leetcode submit region begin(Prohibit modification and deletion)

//
//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        int num1 = 0;
//        int num2 = 0;
//        ListNode listNode1 = l1;
//        ListNode listNode2 = l2;
//        if(l1!=null){
//            while(l1.next!=null){
//                l1 = l1.next;
//                num1++;
//            }
//            num1++;
//        }
//        if(l2!=null){
//            while(l2.next!=null){
//                l2 = l2.next;
//                num2++;
//            }
//            num2++;
//        }
//
//        int[] list = new int[num1+num2];
//        for (int i = 0; i < num1; i++) {
//            list[i] = listNode1.val;
//            listNode1 = listNode1.next;
//        }
//        for (int j = num1; j < num2+num1; j++) {
//            list[j] = listNode2.val;
//            listNode2 = listNode2.next;
//        }
//        Arrays.sort(list);
//
//        if(list.length!=0){
//            ListNode root = new ListNode(list[0]);
//            ListNode other = root;
//            for (int i = 1; i < list.length; i++) {
//                ListNode temp1 = new ListNode(list[i]);
//                other.next = temp1;
//                other = temp1;
//            }
//            return root;
//        }
//        return null;
//    }

}
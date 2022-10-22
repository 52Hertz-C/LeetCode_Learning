package com.leetcode.editor.one;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class OnlyOneNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        singleNumber(nums);
    }
    public static int singleNumber(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(nums[i]);
            if (integer == null) {
                map.put(nums[i], 1);
            } else {
                if (integer + 1 > nums.length/2) {
                    return nums[i];
                }
                map.put(nums[i], integer + 1);
            }
        }
        return 0;
    }
}

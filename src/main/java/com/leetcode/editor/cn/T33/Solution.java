package com.leetcode.editor.cn.T33;

//整数数组 nums 按升序排列，数组中的值 互不相同 。
//
// 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[
//k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2
//,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
//
// 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
//
// 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
//
//
//
// 示例 1：
//
//
//输入：nums = [4,5,6,7,0,1,2], target = 0
//输出：4
//
//
// 示例 2：
//
//
//输入：nums = [4,5,6,7,0,1,2], target = 3
//输出：-1
//
// 示例 3：
//
//
//输入：nums = [1], target = 0
//输出：-1
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 5000
// -104 <= nums[i] <= 104
// nums 中的每个值都 独一无二
// 题目数据保证 nums 在预先未知的某个下标上进行了旋转
// -104 <= target <= 104
//
// Related Topics 数组 二分查找
// 👍 2363 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return -1;
        int left = 0, right = len - 1;
        // 1. 首先明白，旋转数组后，从中间划分，一定有一边是有序的。
        // 2. 由于一定有一边是有序的，所以根据有序的两个边界值来判断目标值在有序一边还是无序一边
        // 3. 这题找目标值，遇到目标值即返回
        // 4. 注意：由于有序的一边的边界值可能等于目标值，所以判断目标值是否在有序的那边时应该加个等号(在二分查找某个具体值得时候如果把握不好边界值，可以再每次查找前判断下边界值，也就是while循环里面的两个if注释)
        while(left <= right){
            // if(nums[left] == target) return left;
            // if(nums[right] == target) return right;

            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            // 右边有序
            if(nums[mid] < nums[right]){
                // 目标值在右边
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                    // 目标值在左边
                }else{
                    right = mid - 1;
                }
                // 左边有序
            }else{
                // 目标值在左边
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                    // 目标值在右边
                }else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


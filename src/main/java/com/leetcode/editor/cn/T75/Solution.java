package com.leetcode.editor.cn.T75;

//给定一个包含红色、白色和蓝色、共 n 个元素的数组
// nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//
// 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
//
//
//
//
// 必须在不使用库的sort函数的情况下解决这个问题。
//
//
//
// 示例 1：
//
//
//输入：nums = [2,0,2,1,1,0]
//输出：[0,0,1,1,2,2]
//
//
// 示例 2：
//
//
//输入：nums = [2,0,1]
//输出：[0,1,2]
//
//
//
//
// 提示：
//
//
// n == nums.length
// 1 <= n <= 300
// nums[i] 为 0、1 或 2
//
//
//
//
// 进阶：
//
//
// 你可以不使用代码库中的排序函数来解决这道题吗？
// 你能想出一个仅使用常数空间的一趟扫描算法吗？
//
//
// Related Topics 数组 双指针 排序 👍 1443 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void sortColors(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }
        int i = 0;
        int two = len;
        int zero = -1;
        while (i < two) {
            if (nums[i] == 0) {
                int tmp = nums[zero + 1];
                nums[++zero] = nums[i];
                nums[i++] = tmp;
            } else if (nums[i] == 2) {
                int tmp = nums[i];
                nums[i] = nums[two - 1];
                nums[--two] = tmp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
}
//leetcode submit region end(Prohibit modification and deletion)


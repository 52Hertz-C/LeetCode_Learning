package com.leetcode.editor.cn.T22;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCodeLearning
 * @description:
 * @packagename: com.leetcode.editor.cn
 * @author: Mr.Jing
 * @date: 2022-10-16 12:44:30
 **/
//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
//
//
// 示例 1：
//
//
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
//
//
// 示例 2：
//
//
//输入：n = 1
//输出：["()"]
//
//
//
//
// 提示：
//
//
// 1 <= n <= 8
//
// Related Topics 字符串 动态规划 回溯
// 👍 2907 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, StringBuilder sb, int open, int close, int n) {
        if (sb.length() == n) {
            res.add(sb.toString());
            return;
        }
        if (open < n) {
            sb.append("(");
            backtrack(res, sb, open+1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(")");
            backtrack(res, sb, open, close+1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


    public static void main(String[] args) {
        List<String> strings = generateParenthesis(2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)


/**
 * Author : Lin Tao
 * Date   : 2020/2/9
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0118_pascals_triangle
 *
 * 118. 杨辉三角
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.easy.solved.i0118_pascals_triangle;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                result.add(new ArrayList<Integer>(Arrays.asList(1)));
                continue;
            }

            if (i == 1) {
                result.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
                continue;
            }

            List<Integer> row = new ArrayList<>(i);
            row.add(1);
            for (int j = 1; j < i - 1; j++) {
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            row.add(1);

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle obj = new PascalsTriangle();
        obj.generate(5);
    }
}

/**
 * Author : Lin Tao
 * Date   : 2020/2/9
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0119_pascals_triangle_ii
 *
 * 119. 杨辉三角 II
 *
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 *
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.easy.unsolved.i0119_pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex);

        for (int i = 0; i < rowIndex; i++) {
            if (i == 0 || i == 1) {
                row.add(1);
            }

            row.set(i, row.get(i - 1) + row.get(i));
        }

        return row;

    }
}

/**
 * Author : Lin Tao
 * Date   : 2020/2/25
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0278_first_bad_version
 *
 * 278. 第一个错误的版本
 *
 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。

 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。

 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。

 示例:

 给定 n = 5，并且 version = 4 是第一个错误的版本。

 调用 isBadVersion(3) -> false
 调用 isBadVersion(5) -> true
 调用 isBadVersion(4) -> true

 所以，4 是第一个错误的版本。
 **********************************************************************************/

package com.lintlint.leetcode.easy.solved.i0278_first_bad_version;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (right != left) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle) == false) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return left;
    }

    private boolean isBadVersion(int middle) {
        return false;
    }
}

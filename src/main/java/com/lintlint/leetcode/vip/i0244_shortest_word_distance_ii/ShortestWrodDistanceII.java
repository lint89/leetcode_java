/**
 * Author : Lin Tao
 * Date   : 2020/1/24
 */

/**********************************************************************************
 * com.lintlint.leetcode.vip.i0244_shortest_word_distance_ii
 *
 * 244. 最短单词距离 II
 *
 * 请设计一个类，使该类的构造函数能够接收一个单词列表。然后再实现一个方法，该方法能够分别接收两个单词 word1 和 word2，并返回列表中这两个单词之间的最短距离。您的方法将被以不同的参数调用 多次。
 *
 * 示例:
 * 假设 words = ["practice", "makes", "perfect", "coding", "makes"]
 *
 * 输入: word1 = “coding”, word2 = “practice”
 * 输出: 3
 * 输入: word1 = "makes", word2 = "coding"
 * 输出: 1
 * 注意:
 * 你可以假设 word1 不等于 word2, 并且 word1 和 word2 都在列表里。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-word-distance-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.vip.i0244_shortest_word_distance_ii;

import java.util.ArrayList;
import java.util.HashMap;

public class ShortestWrodDistanceII {
    HashMap<String, ArrayList<Integer>> location;

    public ShortestWrodDistanceII(String[] words) {
        location = new HashMap<String, ArrayList<Integer>>();
        for (int i = 0; i < words.length; i++) {
            location.putIfAbsent(words[i], new ArrayList<Integer>());
            location.get(words[i]).add(i);
        }
    }

    public int shortest(String word1, String word2) {
        int distance = Integer.MAX_VALUE;

        ArrayList<Integer> l1 = location.get(word1);
        ArrayList<Integer> l2 = location.get(word2);

        for (int i1 : l1) {
            for (int i2 : l2) {
                if (distance > Math.abs(i1 - i2)) {
                    distance = Math.abs(i1 - i2);
                }
            }
        }

        return distance;
    }
}

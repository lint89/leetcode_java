/**
 * Author : Lin Tao
 * Date   : 2020/1/24
 */

/**********************************************************************************
 * com.lintlint.leetcode.vip.i0245_shortest_word_distance_iii
 *
 * 245. 最短单词距离 III
 *
 * 给定一个单词列表和两个单词 word1 和 word2，返回列表中这两个单词之间的最短距离。
 *
 * word1 和 word2 是有可能相同的，并且它们将分别表示为列表中两个独立的单词。
 *
 * 示例:
 * 假设 words = ["practice", "makes", "perfect", "coding", "makes"].
 *
 * 输入: word1 = “makes”, word2 = “coding”
 * 输出: 1
 * 输入: word1 = "makes", word2 = "makes"
 * 输出: 3
 * 注意:
 * 你可以假设 word1 和 word2 都在列表里。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-word-distance-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.vip.i0245_shortest_word_distance_iii;

import java.util.ArrayList;
import java.util.HashMap;

public class ShortestWordDistanceIII {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int distance = words.length;

        HashMap<String, ArrayList<Integer>> location = new HashMap<String, ArrayList<Integer>>();
        for (int i = 0; i < words.length; i++) {
            location.putIfAbsent(words[i], new ArrayList<Integer>());
            location.get(words[i]).add(i);
        }

        ArrayList<Integer> l1, l2;
        if (word1.equals(word2)) {
            l1 = location.get(word1);
            for (int i = 1; i < l1.size(); i++) {
                if (distance > (l1.get(i) - l1.get(i - 1))) {
                    distance = l1.get(i) - l1.get(i - 1);
                }
            }
        } else {
            l1 = location.get(word1);
            l2 = location.get(word2);

            for (int i1 : l1) {
                for (int i2 : l2) {
                    if (distance > Math.abs(i1 - i2)) {
                        distance = Math.abs(i1 - i2);
                    }
                }
            }

        }


        return distance;

    }
}


package test.com.lintlint.leetcode.vip.i0243_shortest_word_distance; 

import com.lintlint.leetcode.vip.i0243_shortest_word_distance.ShortestWordDistance;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* ShortestWordDistance Tester. 
* 
* @author lintlint
* @since <pre>Jan 24, 2020</pre> 
* @version 1.0 
*/ 
public class ShortestWordDistanceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: shortestDistance(String[] words, String word1, String word2) 
* 
*/ 
@Test
public void testShortestDistance() throws Exception {
//TODO: Test goes here...
    String words[] = {"practice", "makes", "perfect", "coding", "makes"};
    assertEquals(3, new ShortestWordDistance().shortestDistance(words, "coding", "practice"));
    assertEquals(1, new ShortestWordDistance().shortestDistance(words, "makes", "practice"));
    assertEquals(3, new ShortestWordDistance().shortestDistance_(words, "coding", "practice"));
    assertEquals(1, new ShortestWordDistance().shortestDistance_(words, "makes", "practice"));
}


} 

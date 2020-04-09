package test.com.lintlint.leetcode.vip.i0244_shortest_word_distance_ii; 

import com.lintlint.leetcode.vip.i0243_shortest_word_distance.ShortestWordDistance;
import com.lintlint.leetcode.vip.i0244_shortest_word_distance_ii.ShortestWrodDistanceII;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* ShortestWrodDistanceII Tester. 
* 
* @author <Authors name> 
* @since <pre>Jan 24, 2020</pre> 
* @version 1.0 
*/ 
public class ShortestWrodDistanceIITest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: shortest(String word1, String word2) 
* 
*/ 
@Test
public void testShortest() throws Exception { 
//TODO: Test goes here... 
    String words[] = {"practice", "makes", "perfect", "coding", "makes"};
    ShortestWrodDistanceII obj = new ShortestWrodDistanceII(words);
    assertEquals(3, obj.shortest("coding", "practice"));
    assertEquals(1, obj.shortest("makes", "practice"));
}


} 

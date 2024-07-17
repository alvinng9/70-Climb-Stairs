package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void climbStairsTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
        assertEquals(1, solution.climbStairs(1));
        assertEquals(8, solution.climbStairs(5));
        assertEquals(34, solution.climbStairs(8));
        assertEquals(377, solution.climbStairs(13));
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zcd.learn.idea;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class RandomQuestionTest {
    
    public RandomQuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of shuffleCard method, of class RandomQuestion.
     */
    @Test
    public void testShuffleCard() {
        System.out.println("shuffleCard");
        RandomQuestion instance = new RandomQuestion();
        String[] result = instance.shuffleCard();
        System.out.println(Arrays.toString(result));
    }

    /**
     * Test of getNumRandom method, of class RandomQuestion.
     */
    @Test
    public void testGetNumRandom() {
        System.out.println("getNumRandom");
        int min = 10;
        int max = 100;
        int num = 20;
        RandomQuestion instance = new RandomQuestion();
        List<Integer> expResult = null;
        List<Integer> result = instance.getNumRandom(min, max, num);
        System.out.println(result);
    }
    
}

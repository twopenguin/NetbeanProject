/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zcd.learn.idea;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 记录一些在解决随机问题时的想法
 * @author zcd
 */
public class RandomQuestion {
    
    /**
     * 洗牌
     * @return 返回洗过的牌
     */
    public String[] shuffleCard(){
        
        final int MaxNum = 54;
        
        //这里面装牌
        String[] puke = new String[MaxNum];
        
        //每个数字只被装一次确保每张牌的唯一性
        for(int i = 0; i < MaxNum; i++){
            puke[i] = "" + i;
        }
        String tempString;
        //当前位置和随机产生的角标交换位置
        for(int i = 0; i < MaxNum; i++){
            int random = ThreadLocalRandom.current().nextInt(MaxNum);
            tempString = puke[i];
            puke[i] = puke[random];
            puke[random] = tempString;
        }
        return puke;
    }
    
}

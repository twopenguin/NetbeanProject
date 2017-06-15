/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zcd.learn.idea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    
    /**
     * 获取一定范围内(大于min，小于max)个数为num 的不重复随机数
     * @return 
     * @param min 最小值
     * @param max 最大值
     * @param num 所需个数
     */
    public List<Integer> getNumRandom(int min, int max,final int num){
        //TODO 条件检查跳过
        List<Integer> result = new ArrayList<>(num);
        Map<Integer, Integer> tempMap = new HashMap<>(num);
        //当前位置和随机产生的角标交换位置
        int temp;
        for(int i = min; i < num + min; i++){
            int random = ThreadLocalRandom.current().nextInt(min ,max);
            temp = getKey(tempMap, i);
            tempMap.put(i, getKey(tempMap, random));
            tempMap.put(random, temp);
        }
        System.out.println(tempMap);
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : tempMap.entrySet()){
            if(i < num){
                result.add(entry.getValue());
            }
            i++;
        }
        return result;
    }
    
    private int getKey(Map<Integer, Integer> target, int key){
        return target.get(key) == null ? key : target.get(key);
    }
}

package com.xiao.basics;

import java.util.HashSet;
import java.util.Set;

/**
 * description Set相关
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/3/1 16:19:13
 * @since jdk 8
 */
public class SetTest {

    /**
     * description HashSet
     *
     * @return HashSet
     * @author xiao
     * date 10:16:39
     */
    public static Set<Integer> getHashSet(){
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);
        return hashSet;
    }
    public static void main(String[] args) {
        forSet();
    }

    private static void forSet() {

    }


}

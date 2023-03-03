package com.xiao.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
     * 底层结构是HashMap利用HashMap的键不可重复性去重
     *
     * @return HashSet
     * @author xiao
     * date 10:16:39
     */
    public static Set<Integer> getHashSet(){
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        return hashSet;
    }
    /**
     * description LinkedHashSet
     * 底层结构是LinkedHashMap
     *
     * @return LinkedHashSet
     * @author xiao
     * date  11:48:15
     */
    public static Set<Integer> getLinkedHashSet(){
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        return linkedHashSet;
    }
    public static void main(String[] args) {
        forSet(getHashSet());
        forSet(getLinkedHashSet());
    }

    private static void forSet(Set<Integer> set) {
        // 第一种：增强for
        for (Integer value : set) {
            System.out.print(value);
        }
        // 第二种：forEach jdk8
        set.forEach(System.out::println);
        // 第三种：使用迭代器Iterator
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }


}

package com.xiao.basics;

import java.util.*;

/**
 * description List相关
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/3/1 11:33:48
 * @since jdk 8
 */
public class ListTest {

    /**
     * description List
     * 1：数据结构：数组
     * 2：适合查找
     *
     * @return List
     * @author xiao
     * date  11:43:39
     */
    public static List<Integer> getArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(null);
        return arrayList;
    }

    /**
     * description LinkedList
     * 1：数据结构：双向链表
     * 2：适合插入和删除
     *
     * @return LinkedList
     * @author xiao
     * date  16:03:47
     */
    public static List<Integer> getLinkedList(){
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        return linkedList;
    }

    /**
     * description Vector
     * 1：数据结构：数组
     * 2：适合查找
     * 3：线程安全
     *  推荐使用Collections.synchronizedList()创建线程安全的List,Vector只是提供了线程安全，
     *  而ArrayList在很多方便都做了优化，比如扩容，序列号等。
     * @return Vector
     * @author xiao
     * date  16:06:21
     */
    public static List<Integer> getVector(){
        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        return vector;
    }
    public static void main(String[] args) {
        forList(getArrayList());
        forList(getLinkedList());
        forList(getVector());
    }

    private static void forList(List<Integer> list) {
        // 第一种：for i
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 第二种：增强for
        for (Integer integer : list) {
            System.out.println(integer);
        }
        // 第三种：forEach jdk8
        list.forEach(System.out::println);
        // 第三种：使用迭代器Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

}

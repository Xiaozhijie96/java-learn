package com.xiao.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * description Map相关
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/2/27 15:34:40
 * @since jdk 8
 */
public class MapTest {


    /**
     * description HashMap
     * 1：最常用的Map，它根据键的HashCode 值存储数据，根据键可以直接获取它的值，具有很快的访问速度。遍历时，取得数据的顺序是完全随机的.
     * 2：最多只允许一条记录的键为Null；允许多条记录的值为 Null。
     * 3：HashMap不支持线程的同步（即任一时刻可以有多个线程同时写HashMap），可能会导致数据的不一致。如果需要同步，
     * 可以用 Collections的synchronizedMap方法使HashMap具有同步的能力，或者使用ConcurrentHashMap。
     *
     * @return HashMap
     * @author xiao
     * date  16:45:52
     */
    private static HashMap<String, Integer> getHashMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("1", 1);
        hashMap.put("2", 2);
        hashMap.put("3", null);
        hashMap.put(null, 4);
        return hashMap;
    }

    /**
     * description LinkedHashMap
     * 1：保存插入顺序:LinkedHashMap保存了记录的插入顺序，在用Iterator遍历时，先得到的记录肯定是先插入的。
     * 2：速度慢:遍历的时候会比HashMap慢，不过有种情况例外：当HashMap容量很大，实际数据较少时，遍历起来可能会比LinkedHashMap慢。
     * 因为LinkedHashMap的遍历速度只和实际数据有关，和容量无关，而HashMap的遍历速度和他的容量有关
     *
     * @return LinkedHashMap
     * @author xiao
     * date  16:56:54
     */
    private static LinkedHashMap<String, Integer> getLinkedHashMap() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", 1);
        linkedHashMap.put("2", 2);
        linkedHashMap.put("3", null);
        linkedHashMap.put(null, 4);
        return linkedHashMap;
    }

    /**
     * description Hashtable
     * HashTable是较为远古的使用Hash算法的容器结构，现在基本已被淘汰
     * 1：Hashtable线程安全
     * 2：不允许键或值为null，否则会抛NullPointerException异常
     * 3：不建议使用HashTable，Oracle官方也将其废弃，建议在多线程环境下使用ConcurrentHashMap类。
     *
     * @return Hashtable
     * @author xiao
     * date  17:07:08
     */
    private static Hashtable<String, Integer> getHashtable() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("1", 1);
        hashtable.put("2", 2);
        return hashtable;
    }

    /**
     * description TreeMap
     * 1：和HashMap类似，TreeMap有序可以排序
     * 2：TreeMap中默认的排序为升序，如果要改变其排序可以自己写一个Comparator
     *
     * @return TreeMap
     * @author xiao
     * date 17:18:27
     */
    private static TreeMap<String, Integer> getTreeMap() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("1", 1);
        treeMap.put("2", 2);
        treeMap.put("3", null);
        return treeMap;
    }

    /**
     * HashMap扩容为原来的两倍
     */
    private static void hashMapCapacity() throws Exception {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            map.put("map" + i, "map");
        }
        Class<?> mapType = map.getClass();
        //容量
        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : " + capacity.invoke(map));

        //个数
        Field size = mapType.getDeclaredField("size");
        size.setAccessible(true);
        System.out.println("size : " + size.get(map));

        //临界值 = capacity * loadFactor
        Field threshold = mapType.getDeclaredField("threshold");
        threshold.setAccessible(true);
        System.out.println("threshold : " + threshold.get(map));

        //负载因子
        Field loadFactor = mapType.getDeclaredField("loadFactor");
        loadFactor.setAccessible(true);
        System.out.println("loadFactor : " + loadFactor.get(map));
        // size 大于 12 触发扩容
        map.put("map12", "map");

        capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : " + capacity.invoke(map));


        size = mapType.getDeclaredField("size");
        size.setAccessible(true);
        System.out.println("size : " + size.get(map));

        threshold = mapType.getDeclaredField("threshold");
        threshold.setAccessible(true);
        System.out.println("threshold : " + threshold.get(map));

        loadFactor = mapType.getDeclaredField("loadFactor");
        loadFactor.setAccessible(true);
        System.out.println("loadFactor : " + loadFactor.get(map));


    }

    public static void main(String[] args) throws Exception {
//        forMap(getHashMap());
//        forMap(getLinkedHashMap());
//        forMap(getHashtable());
//        forMap(getTreeMap());
        hashMapCapacity();
    }

    private static void forMap(Map<String, Integer> map) {
        // 第一种：普遍使用，二次取值
        for (String key : map.keySet()) {
            System.out.printf("key:%s,value:%d%n", key, map.get(key));
        }
        // 第二种：使用entrySet遍历 推荐，尤其 是容量大时
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("entrySet:key:%s,value:%d%n", entry.getKey(), entry.getValue());
        }
        // 第三种：使用迭代器Iterator进行遍历
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.printf("Iterator:key:%s,value:%d%n", entry.getKey(), entry.getValue());
        }
        // 第四种：使用增强for进行遍历 jdk8
        map.forEach((key, value) -> System.out.printf("forEach:key:%s,value:%d%n", key, value));
    }

}

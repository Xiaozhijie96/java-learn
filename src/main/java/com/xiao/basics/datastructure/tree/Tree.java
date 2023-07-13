package com.xiao.basics.datastructure.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * description 树
 *
 * @author xiao
 * @version 1.0.0
 * date 2023/5/16 14:36:13
 * @since jdk 8
 */
public class Tree<T extends Integer> {

    /**
     * 树节点
     */
    private T data;

    /**
     * 父节点
     */
    private Tree<T> parent;

    /**
     * 子节点
     */
    private List<Tree<T>> children;

    public Tree(T data) {
        this.data = data;
        this.children = new LinkedList<>();
    }


    public Tree<T> addChild(T data) {
        Tree<T> childNode = new Tree<>(data);
        if (childNode.parent == null) {
            childNode.parent = this;
        }
        this.children.add(childNode);
        return childNode;
    }

    public Tree<T> findTreeNode(T node) {
        return null;
    }

    public static void main(String[] args) {
        Tree<Integer> treeRoot = new Tree<>(1);
        treeRoot.addChild(2);
        Tree<Integer> childA = treeRoot.addChild(3);
        childA.addChild(4);
        childA.addChild(5);
        Tree<Integer> childB = treeRoot.addChild(6);
        childB.addChild(7);
        childB.addChild(8);
        System.out.println(treeRoot);
    }

}

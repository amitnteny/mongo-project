package com.practice.mongoProject.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class BinaryTree {

    private Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Level order traversal : ");
        tree.printLevelOrder();
    }

    private void printLevelOrder() {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }

    private void printGivenLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            /*if (leftHeight > rightHeight) {
                return leftHeight + 1;
            }
            return rightHeight + 1;*/
            return 1 + ((leftHeight>rightHeight)?leftHeight:rightHeight);
        }
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}


class Sort{
    public static void main(String[] args) {
        int[] arr = {4,3,7,5,9,1};
        Integer[] ar = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        int k=3;
        Arrays.sort(ar, k, 6, new MyComparator());
        Arrays.stream(ar).forEachOrdered(System.out::print);
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        Integer o1 = (Integer) o;
        Integer o2 = (Integer) t1;
        if(o1 > o2) {
            return 1;
        } else if( o1 < o2) {
            return -1;
        } else {
            return 0;
        }
    }
}
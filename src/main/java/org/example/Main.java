package org.example;

import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//        public void run() {
//            System.out.println(1);
//        }
//    }).start();

        new Thread(() -> System.out.println("Hello World")).start();
    }
}
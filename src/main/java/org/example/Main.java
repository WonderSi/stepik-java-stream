package org.example;


public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//        public void run() {
//            System.out.println(1);
//        }
//    }).start();

//        new Thread(() -> System.out.println("Hello World")).start();

        Director director = new Director();
        String result = director.force((int n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print("Working...");
            }
            return "Success";
        }, 5);
        System.out.println(result);
    }
}
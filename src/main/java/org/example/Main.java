package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpDemo httpDemo = new HttpDemo();
       String st = httpDemo.getAllPosts();
        System.out.println(st);
    }
}
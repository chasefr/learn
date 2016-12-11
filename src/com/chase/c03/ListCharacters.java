package com.chase.c03;

/**
 * Created by Chase on 2016/12/9.
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++)
            if (c != 26)  // ANSI Clear screen{
                System.out.println("value: " + (int) c + " character: " + c);
    }
}

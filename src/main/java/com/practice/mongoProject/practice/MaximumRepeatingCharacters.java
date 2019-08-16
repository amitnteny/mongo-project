package com.practice.mongoProject.practice;

import java.util.Scanner;

public class MaximumRepeatingCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        while (true){
            str = s.next();
            if ("0".equals(str) || "".equals(str)){
                break;
            }
            if (str.length() == 1) {
                System.out.println(str);
                break;
            }
            char ch = str.charAt(0);
            int maxLength = 1;
            int initIndex = 0;
            for (int i=1; i<str.length(); i++) {
                if (str.charAt(i) != str.charAt(i-1)) {
                    int chLength = i - initIndex;
                    initIndex = i;
                    if (chLength > maxLength) {
                        maxLength = chLength;
                    }
                }
            }
        }
    }
}

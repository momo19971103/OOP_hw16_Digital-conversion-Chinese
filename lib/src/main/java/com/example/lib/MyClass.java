package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("½Ð¿é¤J¼Æ¦r");
        String s = scanner.next();
        for(int i=0;i<s.length();i++){
            switch (Integer.parseInt(String.valueOf(s.charAt(i)))){
                case 0:
                    System.out.print("¹s");
                    break;
                case 1:
                    System.out.print("³ü");
                    break;
                case 2:
                    System.out.print("¶L");
                    break;
                case 3:
                    System.out.print("°Ñ");
                    break;
                case 4:
                    System.out.print("¸v");
                    break;
                case 5:
                    System.out.print("¥î");
                    break;
                case 6:
                    System.out.print("³°");
                    break;
                case 7:
                    System.out.print("¬m");
                    break;
                case 8:
                    System.out.print("®Ã");
                    break;
                case 9:
                    System.out.print("¨h");
                    break;
            }

        }

    }
}

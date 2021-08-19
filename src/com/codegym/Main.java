package com.codegym;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        TreeMap<String, Integer> list = new TreeMap<>();
        System.out.print(list + "\n");
        String chars;

        do {
            System.out.print("Nhập từ cần ktra: ");
            chars = scanner.nextLine();

            if (list.containsKey(chars)) {
                value = list.get(chars) + 1;
                list.put(chars, value);
            } else if (chars.equals("exits")) {
                System.out.print("Bye");
            } else {
                value = 1;
                list.put(chars, value);
            }

            System.out.print(list + "\n");
        } while (!chars.equals("exits"));

    }
}

package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ListA = new ArrayList<>();
        int a = 0;
        System.out.println("List A:");
        while (a < 5){
        ListA.add(scanner.nextLine());
        a++;
        }
        System.out.println("List A:"+ListA);
        ArrayList<String> ListB = new ArrayList<>();
        int b = 0;
        System.out.println("List B: ");
        while (b < 5){
            ListB.add(scanner.nextLine());
            b++;
        }
        System.out.println("List B:"+ListB);
        Collections.sort(ListA);
        Collections.reverse(ListB);

        ArrayList<String> ListC = new ArrayList<>();
        int c = 0;

        while (c < 5){
            ListC.add(ListA.get(c));
            ListC.add(ListB.get(c));
            c++;
        }
        System.out.println("List C:"+ListC);
        ListC.sort(Comparator.comparing(String::length));
        System.out.println("Отсортированный список по длине:"+ ListC);
    }
}
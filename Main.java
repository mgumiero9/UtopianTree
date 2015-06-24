package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int height=1;

        Scanner sc = new Scanner(System.in);
        //System.out.println("T: ");
        int t = sc.nextInt();

        int[] n;
        n = new int[t];
//to receive input
        for (int i = 0; i < t; i++) {
            //System.out.println("N: ");
            n[i] = sc.nextInt();
        }
//to output data
        for (int i = 0; i < t; i++) {
            for (int j = 1; j <= n[i]; j++) {
                if (j != 0) {
                    if ((j % 2) == 0) {
                        height++;
                    } else {
                        height = height * 2;
                    }
                }
            }
            System.out.println(height);
            height = 1;
        }
    }
}

//package cz.martin;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //Codeforces 1A
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] intInput = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            intInput[i] = Integer.parseInt(input[i]);
        }
        double ma = Math.ceil((float) intInput[0]/intInput[2]);
        double na = Math.ceil((float) intInput[1]/intInput[2]);
        System.out.println((int) (ma*na));
    }
}

package cz.martin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Největší a nejmenší číslo ze vstupu
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(sc.hasNext()) {
            int number = sc.nextInt();
            if(number > max) max = number;
            if(number < min) min = number;
        }
        System.out.println(min+", "+max);
    }
}

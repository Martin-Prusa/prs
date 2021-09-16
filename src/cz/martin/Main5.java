package cz.martin;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("m:");
        int m = sc.nextInt();
        System.out.println("n:");
        int n = sc.nextInt();
        System.out.println("a:");
        int a = sc.nextInt();
        double ma = Math.ceil((float) m/a);
        double na = Math.ceil((float) n/a);
        System.out.println((int) (ma*na));
    }
}

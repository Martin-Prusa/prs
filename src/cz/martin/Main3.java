package cz.martin;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sum = 0;
        boolean odd = false;
        char[] a = input.toCharArray ();
        for (char c : a) {
            int b = Integer.parseInt(c + "");
            if (b % 3 == 0 && odd) sum += b;
            odd = !odd;
        }
        System.out.println(sum);

    }
}

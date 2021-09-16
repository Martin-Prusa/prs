package cz.martin;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Součet všech čísel delitelnych 3 na sudých pozicích
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sum = 0;
        boolean odd = false;
        char[] a = input.toCharArray ();
        for (char c : a) {
            if("1234567989".contains(c+"")) {
                int b = Integer.parseInt(c + "");
                if (b % 3 == 0 && odd) sum += b;
            }
            odd = !odd;
        }
        System.out.println(sum);

    }
}

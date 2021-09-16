package cz.martin;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String numbers = "123456789";
        int sum = 0;
        for (char c : input.toCharArray()) {
            if(numbers.contains(c+"")) sum += Integer.parseInt(c+"");
        }
        System.out.println(sum);
    }
}

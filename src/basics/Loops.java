package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for multiplication table : ");
        int no = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no * i);
        }
    }
}

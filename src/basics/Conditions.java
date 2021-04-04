package basics;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the your age :\n");
        int age = sc.nextInt();

        if (age >= 18 ) {
            System.out.println("You are eligible for voting !!!");
        } else if (age < 18){
            System.out.println("You are not eligible for voting !!!");
        }else {
            System.out.println("Please enter valida age !!!");
        }

    }
}

package basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("====================OUR FANTASTIC MENU==============================");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Sandwich");
        System.out.println("=====================================================================");
        System.out.println("Enter the your food choice :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your Burger will soon on you're table :)");
                break;
            case 2:
                System.out.println("Your Pizza will soon on you're table :)");
                break;
            case 3:
                System.out.println("Your Sandwich will soon on you're table :)");
                break;
            default:
                System.out.println("Please select you're awesome food only available in menu :)");
        }

    }
}

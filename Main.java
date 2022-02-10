package com.assignment;


import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public void checkPalindrome(){
    }

    public static void main (String[] args) {
        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your choice from below list.\n" + "Find Palindrome of number.\n");
            System.out.println();

            choice = sc.nextInt();

        }
        switch (choice) {

            case 0
                ;
                choice = 0;
                break;


            case 1: {
                obj.checkPalindrome();
            }
            break;

            default:
                System.out.println("Invalid choice");

        }
        while (choice != 0) {
            System.out.println("Excited successfully!!");
            sc.close();

        }





    }
}




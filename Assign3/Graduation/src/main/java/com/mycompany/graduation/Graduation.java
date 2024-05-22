/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graduation;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Graduation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageSt ms = new ManageSt();
        int choice;
        do {
            System.out.println("Main Menu:");
            System.out.println("1. Add a new college student.");
            System.out.println("2. Add a new university student.");
            System.out.println("3. Remove a student by student code.");
            System.out.println("4. Print student list.");
            System.out.println("5. Print list of students eligible for graduation.");
            System.out.println("6. Sort student list by type and student code.");
            System.out.println("7. Find student by full name.");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    ms.AddColSt();  
                    break;
                case 2:
                    ms.AddUniSt();
                    break;
                case 3:
                    ms.RemoveSt();
                    break;
                case 4:
                    ms.Print();
                    break;
                case 5:
                    ms.Graduation();
                    break;
                case 6:
                    ms.SortSt();
                    break;
                case 7:
                    ms.FindSt();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        } while (choice != 8);
    }
}

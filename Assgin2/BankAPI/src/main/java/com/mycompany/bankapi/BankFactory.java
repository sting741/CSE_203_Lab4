/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapi;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class BankFactory {
    public static void MainFunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Choose the bank:
                           1:TPBank
                           2:VietcomBank""");
        switch (sc.nextInt()) {
            case 1 -> {
                Bank tp = new TPBank();
                tp.getBankName();
                System.out.println(tp.getBankName());
            }
            case 2 -> {
                Bank vcb = new VietcomBank();
                vcb.getBankName();
                System.out.println(vcb.getBankName());
            }
            default -> throw new AssertionError();
        }
    }
    
}

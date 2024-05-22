/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graduation;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class UniversitySt extends Student {

    protected String thesisName;
    protected double thesisScore;

    public UniversitySt(String thesisName, double thesisScore) {
        super();
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversitySt() {
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Input student thesis name: ");
        thesisName = sc.next();
        System.out.println("Input student thesis score: ");
        thesisScore = sc.nextDouble();
    }

    @Override
    public boolean RequireGraduate() {
        if (thesisScore < 5) {
            return false;
        }
        return super.RequireGraduate();
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.println("student thesis name: " + thesisName);
        System.out.println("student thesis scores: " + thesisScore);
    }
}

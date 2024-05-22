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
public class CollegeSt extends Student {

    protected double graExScore;

    public CollegeSt(double graExScore) {
        super();
        this.graExScore = graExScore;
    }

    public CollegeSt() {
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Input student graduation exam scores: ");
        graExScore = sc.nextDouble();
    }

    @Override
    public boolean RequireGraduate() {
        if (graExScore < 5) {
            return false;
        }
        return super.RequireGraduate();
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.println("student graduation exam scores: " + graExScore);
    }
}

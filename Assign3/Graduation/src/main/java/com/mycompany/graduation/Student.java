/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graduation;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class Student {

    protected String stIDnum;
    protected String stFullName;
    protected int totalcredit;
    protected double avgScore;

    public Student(String stIDnum, String stFullName, int totalcredit, double avgScore) {
        this.stIDnum = stIDnum;
        this.stFullName = stFullName;
        this.totalcredit = totalcredit;
        this.avgScore = avgScore;
    }

    public Student() {
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input student ID: ");
        stIDnum = sc.next();
        System.out.println("Input student full name: ");
        stFullName = sc.next();
        System.out.println("Input student total credit: ");
        totalcredit = sc.nextInt();
        System.out.println("Input student avg score: ");
        avgScore = sc.nextDouble();
    }

    public boolean RequireGraduate() {
        if (totalcredit < 100) {
            return false;
        }
        if (avgScore < 5) {
            return false;
        }
        return true;
    }
    
    public void Output(){
        System.out.println("student ID: " + stIDnum);
        System.out.println("student full name: " + stFullName);
        System.out.println("student total credit: " + totalcredit);
        System.out.println("student avg score: " + avgScore);
    }
    
    static Comparator<Student> compareUniAndCol = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int compare = o1.getClass().toString().compareTo(o2.getClass().toString());
            if (compare == 0) {
                compare = o1.stIDnum.compareTo(o2.stIDnum);
            }
            return compare;
        }
    };
}

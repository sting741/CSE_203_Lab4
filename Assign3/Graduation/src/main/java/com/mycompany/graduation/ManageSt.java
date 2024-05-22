/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graduation;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author phuon
 */
public class ManageSt {

    static Scanner sc = new Scanner(System.in);
    private Vector<Student> stList = new Vector<>();

    public ManageSt(Vector<Student> stList) {
        this.stList = stList;
    }

    public ManageSt() {
    }

    public void AddColSt() {
        Student cs = new CollegeSt();
        stList.add(cs);
        cs.Input();

    }

    public void AddUniSt() {
        Student us = new UniversitySt();
        stList.add(us);
        us.Input();

    }

    public void RemoveSt() {
        System.out.println("Enter student's ID you want to remove: ");
        String remove = sc.next();
        for (int i = 0; i < stList.size(); i++) {
            if (stList.get(i).stIDnum.equals(remove)) {
                stList.remove(i);
            }
        }
    }

    public void Print() {
        for (int i = 0; i < stList.size(); i++) {
            stList.get(i).Output();
        }
    }
    
    public void Graduation(){
        int eligblecount = 0;
        for (int i = 0; i < stList.size(); i++) {
            if (stList.get(i).RequireGraduate()) {
                stList.get(i).Output();
                eligblecount++;
            }
        }
        System.out.println("number of eligible students: " + eligblecount);
    }
    
    public void SortSt(){
        stList.sort(Student.compareUniAndCol);
    }
    
    public void FindSt(){
        System.out.println("Enter a name of student you search for: ");
        String temp = sc.nextLine();
        for (int i = 0; i < stList.size(); i++) {
            if (stList.get(i).stFullName.equals(temp)) {
                stList.get(i).Output();
            }
        }
    }
    
    
}

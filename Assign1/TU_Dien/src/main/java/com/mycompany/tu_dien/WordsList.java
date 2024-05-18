/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tu_dien;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class WordsList {

    public HashMap<String, String> dictionMap = new HashMap<>();

    public WordsList(HashMap<String, String> dictionMap) {
        this.dictionMap = dictionMap;
    }

    public WordsList() {
    }

    public void AddWords() {
        dictionMap.put("hello", "xin chao");
        dictionMap.put("run", "chay");
        dictionMap.put("dictionary", "tu dien");
        dictionMap.put("page", "trang");
        dictionMap.put("student", "hoc sinh");
        dictionMap.put("magnificent", "trang le");
        dictionMap.put("goodbye", "tam biet");
        dictionMap.put("sleep", "ngu");
        dictionMap.put("pardon", "khong nghe thay");
        dictionMap.put("computer", "may tinh");
        dictionMap.put("keyboard", "ban phim");
    }

    public void CheckTheWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the word to check if exists or not: ");
        String temp = sc.next();
        if (dictionMap.containsKey(temp)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void FindMeaning() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the word you want to know: ");
        String temp = sc.next();
        if (dictionMap.containsKey(temp)) {
            temp = dictionMap.get(temp);
            System.out.println(temp);
        } else {
            System.out.println("Cannot find the word in the dictionary");
        }
    }
}

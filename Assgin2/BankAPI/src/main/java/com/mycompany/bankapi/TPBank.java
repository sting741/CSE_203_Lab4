/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapi;

/**
 *
 * @author phuon
 */
public class TPBank extends Bank {

    private String getBankName = "TPBANK";

    public TPBank(String getBankName) {
        this.getBankName = getBankName;
    }

    public TPBank() {
    }

    @Override
    public String getBankName() {
        return getBankName;
    }
}

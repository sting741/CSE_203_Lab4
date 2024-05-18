/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapi;

/**
 *
 * @author phuon
 */
public class VietcomBank extends Bank {

    private String getBankName = "VIETCOMBANK";

    public VietcomBank(String getBankName) {
        this.getBankName = getBankName;
    }

    public VietcomBank() {
    }

    @Override
    public String getBankName() {
        return getBankName;
    }
}

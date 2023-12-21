package com.example.demo.entity;

public class Bank {
    private int ac_no;
    private String c_name;
    private double amount;
    public Bank(int ac_no, String c_name, double amount) {
        this.ac_no = ac_no;
        this.c_name = c_name;
        this.amount = amount;
    }
    public int getAc_no() {
        return ac_no;
    }
    public void setAc_no(int ac_no) {
        this.ac_no = ac_no;
    }
    public String getC_name() {
        return c_name;
    }
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

   

}

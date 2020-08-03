package com.bjpowernode.javase.test012;

public class CreditAccount {
    private String actno;
    private double balance;
    private double credit;

    public CreditAccount() {
        super();
    }

    public CreditAccount(String actno, double balance, double credit) {
        this.actno = actno;
        this.balance = balance;
        this.credit = credit;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    
}

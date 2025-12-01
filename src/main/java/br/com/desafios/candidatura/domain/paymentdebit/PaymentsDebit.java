package br.com.desafios.candidatura.domain.paymentdebit;

import java.util.Date;

public class PaymentsDebit {

    private Long id;
    private String payer;
    private String payee;
    private double amount;
    private Date date;
    private String accountNumber;
    private String bankCode;

    public PaymentsDebit(){

    }

    public PaymentsDebit(Long id, String payer, String payee, double amount, Date date, String accountNumber, String bankCode) {
        this.id = id;
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
        this.date = date;
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}

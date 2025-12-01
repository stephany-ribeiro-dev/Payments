package br.com.desafios.candidatura.domain.paymentcredit;

import java.util.Date;


public class PaymentsCredit {

    private Long id;
    private String payer;
    private String payee;
    private double amount;
    private Date date;
    private String CVV;
    private String cardNumber;
    private String expirationDate;

    public PaymentsCredit(){
    }

    public PaymentsCredit(Long id, String payer, String payee, double amount, Date date, String CVV, String cardNumber, String expirationDate) {
        this.id = id;
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
        this.date = date;
        this.CVV = CVV;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
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

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}

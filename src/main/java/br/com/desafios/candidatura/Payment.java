package br.com.desafios.candidatura;

import java.util.Date;

public class Payment {
		private String type;
		private String payer;
		private String payee;
		private double amount;
		private Date date;
		private String CVV;
		private String cardNumber;
		private String expirationDate;
		private String accountNumber;
		private String bankCode;

		public Payment(String type, String payer, String payee, double amount, Date date, String accountNumber, String bankCode) {
			this.type = type;
			this.payer = payer;
			this.payee = payee;
			this.amount = amount;
			this.date = date;
			this.accountNumber = accountNumber;
			this.bankCode = bankCode;
		}


		public Payment(String type, String payer, String payee, double amount, Date date, String CVV, String cardNumber, String expirationDate) {
			this.type = type;
			this.payer = payer;
			this.payee = payee;
			this.amount = amount;
			this.date = date;
			this.CVV = CVV;
			this.cardNumber = cardNumber;
			this.expirationDate = expirationDate;
		}

		private boolean validateCreditCard(){
			if (this.cardNumber == null || this.expirationDate == null || this.CVV == null) {
				System.out.println("Dados do cartao incompletos.");
				return false;
			}
			return true;
		}

		private boolean validateDebitCard(){
			if (this.accountNumber == null || this.bankCode == null) {
				System.out.println("Dados do cartao incompletos.");
				return false;
			}
			return true;
		}

		private void processCreditCardPayment() {
			System.out.println("Processando pagamento com cartao de credito...");
		}

		private void processDebitCardPayment() {
			System.out.println("Processando pagamento com cartao de debito...");
		}


		public void processPayment() {
			if (type.equals("credit")) {
				System.out.println("Processando cartao de credito...");
				if (!validateCreditCard()) {
					System.out.println("Falha na validacao do cartao de credito.");
					return;
				}
				processCreditCardPayment();
			} else if (type.equals("debit")) {
				System.out.println("Processando cartao de debito...");
				if( !validateDebitCard()) {
					System.out.println("Falha na validacao do cartao de debito.");
					return;
				}
				processDebitCardPayment();
			} else {
				System.out.println("Tipo de pagamento não suportado.");
			}
		}
	}
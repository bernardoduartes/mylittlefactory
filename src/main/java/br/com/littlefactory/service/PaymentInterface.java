package br.com.littlefactory.service;

public interface PaymentInterface {

	PaymentType getPaymentType();
	
	void pay();
}
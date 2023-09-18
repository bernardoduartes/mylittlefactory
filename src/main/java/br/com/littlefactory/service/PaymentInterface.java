package br.com.littlefactory.service;

import br.com.littlefactory.model.PagamentoDto;

public interface PaymentInterface<T> {

	PaymentType getPaymentType();
	
	void pay(T pagamento);
}
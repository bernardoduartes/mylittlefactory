package br.com.littlefactory.service;

import br.com.littlefactory.model.PagamentoDto;

public interface PaymentInterface<T extends PagamentoDto> {

	PaymentType getPaymentType();
	
	void pay(T pagamento);
}
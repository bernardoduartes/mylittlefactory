package br.com.littlefactory.service;

import br.com.littlefactory.model.PagamentoCCDto;
import br.com.littlefactory.model.PagamentoDto;
import br.com.littlefactory.model.PagamentoPIXDto;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class CreditCardService implements PaymentInterface<PagamentoCCDto> {

	@Override
	public PaymentType getPaymentType() {
		return PaymentType.CREDIT_CARD;
	}

	@Override
	public void pay(PagamentoCCDto pagamento) {

	}
}

package br.com.littlefactory.service;

import br.com.littlefactory.model.PagamentoDto;
import br.com.littlefactory.model.PagamentoPIXDto;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class PixService implements PaymentInterface<PagamentoPIXDto> {

	@Override
	public PaymentType getPaymentType() {
		return PaymentType.PIX;
	}

	@Override
	public void pay(PagamentoPIXDto pagamento) {

	}
}

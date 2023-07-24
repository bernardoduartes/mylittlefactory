package br.com.littlefactory.service;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class CreditCardService implements PaymentInterface {

	@Override
	public PaymentType getPaymentType() {
		return PaymentType.CREDIT_CARD;
	}

	@Override
	public void pay() {
		log.info("called pay method : "  + CreditCardService.class.getSimpleName());
	}
}

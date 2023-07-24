package br.com.littlefactory.service;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class PixService implements PaymentInterface {

	@Override
	public PaymentType getPaymentType() {
		return PaymentType.PIX;
	}

	@Override
	public void pay() {
		log.info("called pay method : "  + PixService.class.getSimpleName());
	}
}

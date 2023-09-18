package br.com.littlefactory.service;

import java.util.Set;

import br.com.littlefactory.model.PagamentoPIXDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentFactory paymentFactory;
    
    public PaymentInterface pay(PaymentType paymentType) {
    	PaymentInterface p = paymentFactory.getVideoIntegration(paymentType);
    	p.pay(new PagamentoPIXDto());
    	return p;
    }
    
    public Set<PaymentType> getAllPayMentsMethods() {
    	return paymentFactory.getAllPayMentsMethods();
    }
}

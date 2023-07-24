package br.com.littlefactory.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentFactory paymentFactory;
    
    public PaymentInterface cc() {
    	PaymentInterface p = paymentFactory.getVideoIntegration(PaymentType.CREDIT_CARD);
    	p.pay();
    	return p;
    }
    
    public PaymentInterface pix() {
    	PaymentInterface p = paymentFactory.getVideoIntegration(PaymentType.PIX);
    	p.pay();
    	return p;
    }
    
    public Set<PaymentType> getAllPayMentsMethods() {
    	return paymentFactory.getAllPayMentsMethods();
    }
}

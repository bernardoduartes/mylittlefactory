package br.com.littlefactory.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentFactory {
	
    private final Map<PaymentType, PaymentInterface> players = new HashMap<>();

    @Autowired
    public PaymentFactory(Set<PaymentInterface> playersSet) {
        createImpls(playersSet);
    }

    public PaymentInterface getVideoIntegration(PaymentType paymentType) {
        if (Objects.isNull(paymentType) || Objects.isNull(players.get(paymentType))) {
            throw new RuntimeException("Tipo de pagamento não foi encontrado");
        }
        return players.get(paymentType);
    }
    
    public Set<PaymentType> getAllPayMentsMethods() {
    	return players.keySet();
    }
    
    private void createImpls(Set<PaymentInterface> strategySet) {
        
        strategySet.forEach(
                strategy -> players.put((PaymentType) strategy.getPaymentType(), strategy));
        
        System.out.println();
    }
}

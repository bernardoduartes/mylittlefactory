package br.com.littlefactory.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.littlefactory.service.PaymentInterface;
import br.com.littlefactory.service.PaymentService;
import br.com.littlefactory.service.PaymentType;

@RestController
@RequestMapping("pay")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
    @PostMapping("{paymentType}")
    public ResponseEntity<PaymentInterface> pay(@PathVariable PaymentType paymentType){
        return ResponseEntity.ok(paymentService.pay(paymentType));
    }
    
    @GetMapping("all")
    public ResponseEntity<Set<PaymentType>> getAllPayMentsMethods(){
        return ResponseEntity.ok(paymentService.getAllPayMentsMethods());
    }
}
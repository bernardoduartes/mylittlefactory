package br.com.littlefactory.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
    @GetMapping("cc")
    public ResponseEntity<PaymentInterface> get(){
        return ResponseEntity.ok(paymentService.cc());
    }
    
    @GetMapping("pix")
    public ResponseEntity<PaymentInterface> pix(){
        return ResponseEntity.ok(paymentService.pix());
    }
    
    @GetMapping("all")
    public ResponseEntity<Set<PaymentType>> getAllPayMentsMethods(){
        return ResponseEntity.ok(paymentService.getAllPayMentsMethods());
    }
}
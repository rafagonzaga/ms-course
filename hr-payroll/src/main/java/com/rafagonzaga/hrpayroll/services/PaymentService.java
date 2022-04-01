package com.rafagonzaga.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.rafagonzaga.hrpayroll.entities.Payment;

@Service // registra a classe como componente do spring. Poderia usar @Component
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}

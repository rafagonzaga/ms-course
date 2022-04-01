package com.rafagonzaga.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafagonzaga.hrpayroll.entities.Payment;
import com.rafagonzaga.hrpayroll.entities.Worker;
import com.rafagonzaga.hrpayroll.feignclients.WorkerFeignClient;

@Service // registra a classe como componente do spring. Poderia usar @Component
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		// Dados mockados
		// return new Payment("Bob", 200.0, days);
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}

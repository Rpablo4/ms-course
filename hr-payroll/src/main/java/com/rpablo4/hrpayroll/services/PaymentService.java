package com.rpablo4.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpablo4.hrpayroll.entities.Payment;
import com.rpablo4.hrpayroll.entities.Worker;
import com.rpablo4.hrpayroll.feignclient.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}

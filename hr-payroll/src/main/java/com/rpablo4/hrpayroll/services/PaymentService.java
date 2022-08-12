package com.rpablo4.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.rpablo4.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}

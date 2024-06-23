package com.jack.service;

import com.stripe.exception.StripeException;
import com.jack.model.Order;
import com.jack.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}

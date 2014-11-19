package com.dreamoval.iwallet.connector;

import java.math.BigDecimal;

import com.i_walletlive.paylive.ArrayOfOrderItem;
import com.i_walletlive.paylive.OrderResult;
import com.i_walletlive.paylive.PaymentServiceSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component(value = "integrator")
public class Integrator{

	@Autowired
	@Qualifier("iwallet")
    PaymentServiceSoap paymentService;

	public void cancelTransaction() {

	}

	public OrderResult mobilePaymentOrder(String orderId, BigDecimal subtotal,
			BigDecimal shippingCost, BigDecimal taxAmount, BigDecimal total,
			String comment1, String comment2, ArrayOfOrderItem orderItems) {
			OrderResult result = paymentService.mobilePaymentOrder(orderId, subtotal, shippingCost, taxAmount, total, comment1, comment2, orderItems);
		return result;
	}

	public String processPaymentOrder(String orderId, BigDecimal subtotal,
			BigDecimal shippingCost, BigDecimal taxAmount, BigDecimal total,
			String comment1, String comment2, ArrayOfOrderItem orderItems) {
			String response = paymentService.processPaymentOrder(orderId, subtotal, shippingCost, taxAmount, total, comment1, comment2, orderItems);
		return response;
	}

	public String processPaymentJSON(String orderId, BigDecimal amount,
			String comment1, String comment2, ArrayOfOrderItem orderItems) {
			String response = paymentService.processPaymentJSON(orderId, amount, comment1, comment2, orderItems);
		return response;
	}

	public int confirmTransaction(String payToken, String transactionId) {
		int response = paymentService.confirmTransaction(payToken, transactionId);
		return response;
	}

	public String generatePaymentCode(String orderId, BigDecimal subtotal,
			BigDecimal shippingCost, BigDecimal taxAmount, BigDecimal total,
			String comment1, String comment2, ArrayOfOrderItem orderItems,
			String payerName, String payerMobile, String providerName,
			String providerType) {
			String response = paymentService.generatePaymentCode(orderId, subtotal, shippingCost, taxAmount, total, comment1, comment2, orderItems, payerName, payerMobile, providerName, providerType);
		return response;
	}

	public OrderResult verifyMobilePayment(String orderId) {
		OrderResult result = paymentService.verifyMobilePayment(orderId);
		return result;
	}

	public int cancelTransaction(String payToken, String transactionId) {
		int response = paymentService.cancelTransaction(payToken, transactionId);
		return response;
	}

	public String checkPaymentStatus(String orderId, String providerName,
			String providerType) {
		String response = paymentService.checkPaymentStatus(orderId, providerName, providerType);
		return response;
	}

	public String processOrder(String amount, String custRef, String comment1,
			String comment2, String unitPrice, String quantity, String item,
			String useToken, String useIntMode) {
		   String response = paymentService.processOrder(amount, custRef, comment1, comment2, unitPrice, quantity, item, useToken, useIntMode);
		return response;
	}

}

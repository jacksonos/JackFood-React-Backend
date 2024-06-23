package com.jack.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.jack.Exception.CartException;
import com.jack.Exception.OrderException;
import com.jack.Exception.RestaurantException;
import com.jack.Exception.UserException;
import com.jack.model.Order;
import com.jack.model.PaymentResponse;
import com.jack.model.User;
import com.jack.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}

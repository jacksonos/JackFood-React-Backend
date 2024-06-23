package com.jack.service;

import java.util.List;

import com.jack.model.Notification;
import com.jack.model.Order;
import com.jack.model.Restaurant;
import com.jack.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}

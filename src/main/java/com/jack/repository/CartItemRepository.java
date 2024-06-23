package com.jack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jack.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}

package com.jack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jack.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}

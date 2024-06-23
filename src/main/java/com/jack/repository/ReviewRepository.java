package com.jack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jack.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}

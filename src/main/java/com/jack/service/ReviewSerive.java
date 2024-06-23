package com.jack.service;

import java.util.List;

import com.jack.Exception.ReviewException;
import com.jack.model.Review;
import com.jack.model.User;
import com.jack.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}

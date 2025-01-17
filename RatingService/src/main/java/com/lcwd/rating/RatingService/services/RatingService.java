package com.lcwd.rating.RatingService.services;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RatingService {

 Rating create(Rating rating);

 List<Rating> getRatings();

 List<Rating> getRatingsByUserId(String userId);

 List<Rating> getRatingByHotelId(String hotelId);
}

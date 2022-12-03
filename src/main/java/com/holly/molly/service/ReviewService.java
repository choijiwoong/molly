package com.holly.molly.service;

import com.holly.molly.domain.Review;
import com.holly.molly.domain.User;
import com.holly.molly.repository.ReviewRepository;
import com.holly.molly.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Transactional//필요시에만 readOnly=false
    public Long join(Review review){
        reviewRepository.save(review);
        return review.getId();
    }

    @Transactional
    public Long delete(Review review){
        reviewRepository.delete(review);
        return review.getId();
    }

    public Review findOne(Long id){ return reviewRepository.findOne(id); }

    public List<Review> findAll(){
        return reviewRepository.findAll();
    }

    public void clear(){ reviewRepository.clear(); }//for test
}

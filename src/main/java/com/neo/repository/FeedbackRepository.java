package com.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}

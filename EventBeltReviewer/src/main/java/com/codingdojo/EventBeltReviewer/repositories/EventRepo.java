package com.codingdojo.EventBeltReviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.EventBeltReviewer.models.Event;

@Repository
public interface EventRepo extends CrudRepository <Event, Long>  {

}

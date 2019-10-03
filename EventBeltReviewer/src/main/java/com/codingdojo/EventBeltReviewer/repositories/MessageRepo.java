package com.codingdojo.EventBeltReviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.EventBeltReviewer.models.Message;

@Repository
public interface MessageRepo extends CrudRepository <Message, Long>{

}

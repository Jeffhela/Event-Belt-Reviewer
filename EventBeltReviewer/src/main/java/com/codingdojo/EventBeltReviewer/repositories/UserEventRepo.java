package com.codingdojo.EventBeltReviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.EventBeltReviewer.models.UserEvent;

@Repository
public interface UserEventRepo extends CrudRepository<UserEvent, Long> {

}

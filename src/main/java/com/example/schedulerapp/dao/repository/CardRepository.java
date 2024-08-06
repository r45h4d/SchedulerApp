package com.example.schedulerapp.dao.repository;

import com.example.schedulerapp.dao.entity.CardEntity;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<CardEntity, Long> {

}

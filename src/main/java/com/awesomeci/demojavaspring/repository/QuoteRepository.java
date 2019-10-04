package com.awesomeci.demojavaspring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.awesomeci.demojavaspring.model.Quote;

public interface QuoteRepository extends CrudRepository<Quote, Long> {

    @Override
    List<Quote> findAll();

}

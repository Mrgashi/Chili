package com.example.demo;


import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface ChiliRepositoryWithDataJPA extends CrudRepository<Chili, Integer> {

    Iterable<Chili> findAll(Sort sort);

}

package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ChiliRepositoryWithDataJPA extends CrudRepository<Chili, Integer> {
    @Query("SELECT chili FROM Chili chili WHERE chili.scovilleOfChili > ?1 ORDER BY chili.scovilleOfChili DESC")
    Iterable<Chili> findChiliesWithQueryScoville(int scovilleOfChili);
}


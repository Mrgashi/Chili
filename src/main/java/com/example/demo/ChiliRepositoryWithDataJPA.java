package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//Crudrepository for alle chili objektene, knytter objektene opp mot databasen

public interface ChiliRepositoryWithDataJPA extends CrudRepository<Chili, Integer> {
    @Query("SELECT chili FROM Chili chili WHERE chili.scovilleOfChili > ?1 ORDER BY chili.scovilleOfChili DESC")
    Iterable<Chili> findChiliesWithQueryScoville(int scovilleOfChili);
}


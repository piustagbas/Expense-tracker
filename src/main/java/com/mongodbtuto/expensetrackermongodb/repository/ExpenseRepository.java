package com.mongodbtuto.expensetrackermongodb.repository;

import com.mongodbtuto.expensetrackermongodb.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {


    @Query("{ 'expenseName' : ?0 }")
    Optional<Expense> findByName(String expenseName);


}

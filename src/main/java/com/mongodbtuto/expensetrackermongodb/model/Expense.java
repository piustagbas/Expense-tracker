package com.mongodbtuto.expensetrackermongodb.model;

import com.mongodbtuto.expensetrackermongodb.enumz.ExpenseCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document( "expense")
public class Expense {

    @Id
    private String id;

    @Field(name="name")
    @Indexed(unique = true)  //can not store more than one expense with the same nam
    private String expenseName;

    @Field(name="category") //the name you want it to be in the database
    private ExpenseCategory expenseCategory;

    @Field(name="amount")
    private BigDecimal expenseAmount;
}

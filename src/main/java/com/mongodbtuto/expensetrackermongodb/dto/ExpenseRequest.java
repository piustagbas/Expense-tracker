package com.mongodbtuto.expensetrackermongodb.dto;

import com.mongodbtuto.expensetrackermongodb.enumz.ExpenseCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ExpenseRequest {


    private String expenseName;


    private ExpenseCategory expenseCategory;

    private BigDecimal expenseAmount;
}

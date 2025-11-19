//9. Write the program using streams to compute the total amount spent on each category. Also sorted by category name
package com.ex;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

//
@Data
@EqualsAndHashCode
@ToString
class Expense {
    String category;
    int amount;

    Expense(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

public static void main(String[] args) {
        List<Expense> expenses = Arrays.asList(
        new Expense("Food", 50),
        new Expense("Travel", 100),
        new Expense("Food", 100),
        new Expense("Travel", 200),
        new Expense("Bills", 500),
        new Expense("Clothes", 1000),
        new Expense("Bills", 100)
        );

        Map<String,List<Expense>> res = expenses.stream().collect(Collectors.groupingBy(Expense::getCategory));

        res.forEach((k,v) -> System.out.println("K : "+k +" V :"+v));

// For each category, calculate total expense
    res.entrySet().stream()
            .forEach(entry -> {
                String category = entry.getKey();
                // Reduce the list of expenses to total amount
                int total = entry.getValue().stream()
                        .map(Expense::getAmount)           // Stream<Integer>
                        .reduce(0, (x,y)->x+y);          // Reduce to total

                System.out.println(category + " -> " + total);
            });

    }
}
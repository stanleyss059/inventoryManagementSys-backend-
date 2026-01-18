package com.stanleyinventorydev.inventorysys.repositories;

import com.stanleyinventorydev.inventorysys.models.Category;
import com.stanleyinventorydev.inventorysys.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {

}

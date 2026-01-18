package com.stanleyinventorydev.inventorysys.repositories;

import com.stanleyinventorydev.inventorysys.models.Category;
import com.stanleyinventorydev.inventorysys.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {


}

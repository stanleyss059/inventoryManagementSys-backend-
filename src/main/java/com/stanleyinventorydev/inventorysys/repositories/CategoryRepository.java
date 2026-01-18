package com.stanleyinventorydev.inventorysys.repositories;

import com.stanleyinventorydev.inventorysys.models.Category;
import com.stanleyinventorydev.inventorysys.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}

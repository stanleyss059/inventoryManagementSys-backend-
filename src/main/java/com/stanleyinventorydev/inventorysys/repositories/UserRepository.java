package com.stanleyinventorydev.inventorysys.repositories;

import com.stanleyinventorydev.inventorysys.models.Category;
import com.stanleyinventorydev.inventorysys.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(
            String email
    );
}

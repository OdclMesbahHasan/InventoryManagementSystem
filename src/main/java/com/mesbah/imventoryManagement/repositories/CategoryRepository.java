package com.mesbah.imventoryManagement.repositories;

import com.mesbah.imventoryManagement.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

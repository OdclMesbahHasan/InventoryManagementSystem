package com.mesbah.imventoryManagement.repositories;

import com.mesbah.imventoryManagement.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}

package com.memory_book.www.memory_book.repository;

import com.memory_book.www.memory_book.model.BestSeller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestSellerRepository extends JpaRepository<BestSeller, Long> {
}

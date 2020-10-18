package com.memory_book.www.memory_book.repository;

import com.memory_book.www.memory_book.model.NewBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewBookRepository extends JpaRepository<NewBook, Long> {
}

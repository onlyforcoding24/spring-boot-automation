package com.springboot.automation.springbootautomation.persistence.repo;

import com.springboot.automation.springbootautomation.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}

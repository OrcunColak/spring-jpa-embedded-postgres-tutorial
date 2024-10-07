package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository  extends JpaRepository<Author, Long> {

}

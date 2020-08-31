package com.shoshonearnold.SpringPractice.Repositories;

import com.shoshonearnold.SpringPractice.Entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

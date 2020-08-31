package com.shoshonearnold.SpringPractice.Repositories;

import com.shoshonearnold.SpringPractice.Entities.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

package com.bharath.eventmanagement.repos;

import com.bharath.eventmanagement.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface EventRepository extends CrudRepository<Event,Long> {
}

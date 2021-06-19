package com.bharath.eventmanagement.repos;

import com.bharath.eventmanagement.entities.Event;
import com.bharath.eventmanagement.entities.Organizer;
import org.springframework.data.repository.CrudRepository;

public interface OrganizerRepository extends CrudRepository<Organizer,Long>  {
}

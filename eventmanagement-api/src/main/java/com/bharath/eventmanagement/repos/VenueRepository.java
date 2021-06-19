package com.bharath.eventmanagement.repos;

import com.bharath.eventmanagement.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue,Long> {
}

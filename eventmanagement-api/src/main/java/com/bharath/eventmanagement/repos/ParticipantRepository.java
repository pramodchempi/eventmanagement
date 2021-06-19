package com.bharath.eventmanagement.repos;

import com.bharath.eventmanagement.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant,Long> {
}

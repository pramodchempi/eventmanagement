package com.bharath.eventmanagement.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Organizer extends AbstractEntity {

	public Organizer() {

	}

	public Organizer(String name) {
		this.name = name;
	}

	private String name;

	@OneToMany(mappedBy = "organizer")
	@JsonProperty
	private Set<Event> events;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Organizer) obj).id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

/*	public Organizer(String name, Set<Event> events) {
		this.name = name;
		this.events = events;
	}*/

	public Long getResourceId() {
		return this.id;
	}

}

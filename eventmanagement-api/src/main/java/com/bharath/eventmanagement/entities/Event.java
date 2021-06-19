package com.bharath.eventmanagement.entities;

import java.time.ZoneId;


import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@Entity
public class Event extends AbstractEntity {
	private String name;
	private String description;

	@Column(name = "START_TIME")
	private ZonedDateTime startTime;

	@Column(name = "END_TIME")
	private ZonedDateTime endTime;

	@Column(name = "ZONE_ID", columnDefinition = "LONGTEXT")
	private ZoneId zoneId;

	private Boolean started;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(nullable = false)
	private Organizer organizer;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@RestResource(exported = false)
	@JoinColumn(nullable = false)
	private Venue venue;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "event")
	private Set<Participant> participants;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ZonedDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(ZonedDateTime startTime) {
		this.startTime = startTime;
	}

	public ZonedDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(ZonedDateTime endTime) {
		this.endTime = endTime;
	}

	public ZoneId getZoneId() {
		return zoneId;
	}

	public void setZoneId(ZoneId zoneId) {
		this.zoneId = zoneId;
	}

	public Boolean getStarted() {
		return started;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public Set<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<Participant> participants) {
		this.participants = participants;
	}

	// *These Equals and hashcode is to do aditional check to make sure Ids are same
	// & there references are same.
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Event) obj).id);

	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

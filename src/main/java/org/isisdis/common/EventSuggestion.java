package org.isisdis.common;

import java.util.Date;
import java.util.Set;

import lombok.Data;

public @Data class EventSuggestion {
	private Date startDate;
	private Date endDate;
	private String description;
	private Set<Contact> contacts;
	private Collaborator collaborator;
	private String address;
}

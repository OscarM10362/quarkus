package com.beesion.ms.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Person {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PersonIdGenerator")
	@SequenceGenerator(name = "PersonIdGenerator", sequenceName = "person_seq", allocationSize = 1)
	private Long id;
	@Column(nullable = false)
	private String name;

	// Getters y setters
	public Long getId() { return id; }

	public void setId(Long id) { this.id = id; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
}




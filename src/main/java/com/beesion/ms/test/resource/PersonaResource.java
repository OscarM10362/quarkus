package com.beesion.ms.test.resource;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.service.IPersonService;
import com.beesion.ms.test.service.impl.PersonService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/Person")
public class PersonaResource {

	@Inject
	PersonService person;
	@Inject
	IPersonService personService;


	@POST
	public PersonDto create(PersonDto dto) {
		return personService.create(dto);
	}

	@GET
	public List<PersonDto> getAll() {
		return personService.findAll();
	}

	@GET
	@Path("/{id}")
	public PersonDto getById(@PathParam("id") Long id) {
		return personService.findById(id);

	}

	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") Long id) {
		personService.delete(id);
	}

}

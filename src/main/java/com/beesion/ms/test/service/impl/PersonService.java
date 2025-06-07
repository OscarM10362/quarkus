package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.map.PersonMap;
import com.beesion.ms.test.repository.PersonRepo;
import com.beesion.ms.test.service.IPersonService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PersonService implements IPersonService{

	@Inject
	PersonRepo personRepository;

	@Inject
	PersonMap personMapper;

	@Override
	public PersonDto create(PersonDto personDto) {
		Person person = personMapper.toEntity(personDto);
		personRepository.save(person);
		return personMapper.toDto(person);
	}

	@Override
	public List<PersonDto> findAll() {
		return personRepository.lisAll()
				.stream()
				.map(personMapper::toDto)
				.collect(Collectors.toList());
	}

	@Override
	public PersonDto findById(Long id) {
		Person person = personRepository.findById(id);
		return person != null ? personMapper.toDto(person) : null;
	}

	@Override
	public void delete(Long id) {
		personRepository.delete(id);
	}
}

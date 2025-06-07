package com.beesion.ms.test.service;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;

import java.util.List;

public interface IPersonService {

	PersonDto create(PersonDto personDto);
	List<PersonDto> findAll();
	PersonDto findById(Long id);
	void delete(Long id);


}

package com.beesion.ms.test.map;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;

public class PersonMap {
    public PersonDto toDto(Person person) {
        PersonDto dto = new PersonDto();
        dto.setId(person.getId());
        dto.setName(person.getName());
        return dto;
    }
    public Person toEntity(PersonDto dto) {
        Person person = new Person();
        person.setId(dto.getId());
        person.setName(dto.getName());
        return person;
    }
}

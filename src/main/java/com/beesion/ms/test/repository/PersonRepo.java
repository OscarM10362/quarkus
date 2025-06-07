package com.beesion.ms.test.repository;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.repository.impl.IPersonRepo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class PersonRepo implements IPersonRepo {

	@PersistenceContext
	private EntityManager entityManager;

	public Person save(Person person) {
		entityManager.persist(person);
		return person;
	}

	public Person findById(Long id) {
		return entityManager.find(Person.class, id);
	}

	public List<Person> lisAll() {
		return entityManager.createQuery("SELECT p FROM Person p", Person.class).getResultList();
	}

	public void delete(Long id) {
		Person person = findById(id);
		if (person != null) {
			entityManager.remove(person);
		}
	}

}

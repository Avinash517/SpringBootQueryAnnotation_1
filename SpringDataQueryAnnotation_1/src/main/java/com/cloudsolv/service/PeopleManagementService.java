package com.cloudsolv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudsolv.dao.PeopleManangementDao;
import com.cloudsolv.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManangementDao peopleManangementDao;

	public List<Person> getPersonsInfoByLastName(String lastName) {
		return peopleManangementDao.getPeronInfoByLastName(lastName);
	}

	public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {
		return peopleManangementDao.findByFirstNameAndEmail(firstName, email);
	}
}
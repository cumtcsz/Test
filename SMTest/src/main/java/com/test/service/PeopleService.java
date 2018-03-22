package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.IPeopleDao;
import com.test.entity.People;

@Service
public class PeopleService {

	@Autowired
	IPeopleDao peopleDao;
	
	public void save(People people){
		peopleDao.save(people);
	}
	
	public People getPeople(){
		return peopleDao.getPeople();
	}
}

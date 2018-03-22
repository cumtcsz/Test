package com.test.dao;import org.springframework.stereotype.Service;import com.test.entity.People;
public interface IPeopleDao {

	public void save(People people);
	public People getPeople();
}

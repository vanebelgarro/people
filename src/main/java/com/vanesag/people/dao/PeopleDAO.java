package com.vanesag.people.dao;

import java.util.List;

import com.vanesag.people.entity.People;
import com.vanesag.people.entity.Statistics;

public interface PeopleDAO {
	
	public void crearCliente(People persona);
	
	public List<People> listarPersonas();
	
	public Statistics listarEstaditicos();
}

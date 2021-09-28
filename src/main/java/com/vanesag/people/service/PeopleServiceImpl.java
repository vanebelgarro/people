package com.vanesag.people.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vanesag.people.dao.PeopleDAO;
import com.vanesag.people.entity.People;
import com.vanesag.people.entity.Statistics;

@Service
public class PeopleServiceImpl implements PeopleService{
	@Autowired
    private PeopleDAO peopleDAO;    

    @Override
    public void crearCliente(People people) {
    	peopleDAO.crearCliente(people);

    }
    
    @Override
    public List<People> listarPersonas() {
        List<People> listPeople= peopleDAO.listarPersonas();
        return listPeople;
    }
    
    @Override
    public Statistics listarEstaditicos() {
    	Statistics statistics= peopleDAO.listarEstaditicos();
        return statistics;
    }

}

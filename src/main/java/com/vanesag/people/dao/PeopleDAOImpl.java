package com.vanesag.people.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import com.vanesag.people.controller.PeopleNotFoundException;
import com.vanesag.people.entity.People;
import com.vanesag.people.entity.Statistics;

@Repository
public class PeopleDAOImpl implements PeopleDAO{
    
	@Autowired
    private EntityManager entityManager;
	
	@Override
    public void crearCliente(People persona) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(persona);
    }
	
	
	@Override
    public List<People> listarPersonas() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<People> theQuery = currentSession.createQuery("from People", People.class);
        List<People> people = theQuery.getResultList();
        Calendar d = Calendar.getInstance();
        
        for (int i=0; i<people.size(); i++) {
        	People aux = people.get(i);
        	d.setTime(aux.getNacimiento());
            d.add(Calendar.YEAR, 100);
            aux.setMuerte(d.getTime());
            people.set(i, aux);
        }
        return people;
    }

	@Override
    public Statistics listarEstaditicos() {
		Statistics statistics = new Statistics();
        Session currentSession = entityManager.unwrap(Session.class);
        Object[] theQuery = (Object[]) currentSession.createQuery("SELECT avg(edad) as promedio, STDDEV(edad) as desviacion FROM People").uniqueResult();
        if(theQuery[0]!=null) {
	        statistics.setPromedio(Double.parseDouble(theQuery[0].toString()));
	        statistics.setDesviacion(Double.parseDouble(theQuery[1].toString()));
        }
        return statistics;
    }
	
	

}



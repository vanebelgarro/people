package com.vanesag.people.service;

import java.util.List;

import com.vanesag.people.entity.People;
import com.vanesag.people.entity.Statistics;

public interface PeopleService {

    public void crearCliente(People people);

    public List<People> listarPersonas();
    
    public Statistics listarEstaditicos();
}

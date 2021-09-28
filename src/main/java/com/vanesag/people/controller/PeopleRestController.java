package com.vanesag.people.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vanesag.people.entity.People;
import com.vanesag.people.entity.Statistics;
import com.vanesag.people.service.PeopleService;

//Indiciamos que es un controlador rest
@RestController
@RequestMapping("/") //esta sera la raiz de la url, es decir http://127.0.0.1:8083/

public class PeopleRestController {
	//Inyectamos el servicio para poder hacer uso de el
    @Autowired
    private PeopleService PeopleService;
    
    /*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
    http://127.0.0.1:8083/crearcliente  */
    @PostMapping("crearcliente")
    public People addPeople(@RequestBody People people) {
        people.setId(0);
        //Este metodo guardará la persona enviada
        PeopleService.crearCliente(people);
        return people;
    }
    
    /*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    http://127.0.0.1:8083/listclientes*/
    @GetMapping("/listclientes")
    public List<People> listarPersonas(){
        //retornará todos los usuarios
        return PeopleService.listarPersonas();
    }
    
    /*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    http://127.0.0.1:8083/kpideclientes*/
    @GetMapping("/kpideclientes")
    public Statistics listarEstadisticos(){
        //retornará todos los usuarios
        return PeopleService.listarEstaditicos();
    }
  
    
    
    
}

package com.vanesag.people.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="persona")
public class People {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_persona")
    private int id;

    @Column(name="nombre_persona")
    private String nombre;

    @Column(name="apellido_persona")
    private String apellido;

    @Column(name="nacimiento_persona")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date nacimiento;

    @Column(name="edad_persona")
    private int edad;
    
    @Transient
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date muerte;

    public People() {}
    
    public People(String nombre, String apellido, int edad, Date nacimiento, Date muerte) {
    	this.nombre= nombre;
    	this.apellido = apellido;
    	this.edad = edad;
    	this.nacimiento = nacimiento;
    	this.muerte = muerte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Date getMuerte() {
        return muerte;
    }

    public void setMuerte(Date muerte) {
        this.muerte = muerte;
    }

    @Override
    public String toString() {
        return "People [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento
                + ", edad=" + edad + ", muerte=" + muerte + "]";
    }


}

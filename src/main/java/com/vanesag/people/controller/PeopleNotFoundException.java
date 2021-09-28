package com.vanesag.people.controller;

public class PeopleNotFoundException extends Exception 
{        
     private static final long serialVersionUID = 1L;

     public String message;

     public PeopleNotFoundException(String msg) {
         this.message = msg;
     }

  // Overrides Exception's getMessage()
     @Override
     public String getMessage(){
         return message;
     }
 }

package com.vanesag.people.entity;




public class Statistics {
	
    private Double promedio;
	
    private Double desviacion;
    
    public Statistics () {}
    
    public Statistics (Double promedio, Double desviacion) {
    	this.promedio = promedio;
    	this.desviacion = desviacion;
    }
    
    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Double getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(Double desviacion) {
        this.desviacion = desviacion;
    }
}

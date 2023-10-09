/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PROG05_Ejerc1; // Nombre del paquete

import java.time.LocalDate; // Importamos LocalDate para trabajar con fechas
import java.time.Period; // Importamos Period para que nos muestre el tiempo
// pasado desde la matriculación hasta el día de hoy

/**
 * @author diego
 */

/**
 * En la siguiente clase, llamada vehículo, vamos a crear los atributos que 
 * contendra dicha clase
 */

public class Vehiculo { // Inicio clase vehiculo
    
    /**
     * Declaramos los atributos privados
     */
    
    private String marca;
    private String matricula;
    private int numKm;
    private LocalDate fechaMatriculacion;
    private String descripcion;
    private double precio;
    private String nomPropietario;
    private String dniPropietario;
    
    // Implementamos el constructor de la clase vacio

    public Vehiculo() {
    } // Fin del constructor vehículo vacío
    
    // Implementamos el constructor de la clase con atributos
    
    public Vehiculo(String marca, String matricula, int numKm, LocalDate 
            fechaMatriculacion, String descripcion, double precio, String 
            nomPropietario, String dniPropietario) {
        
        this.marca = marca;
        this.matricula = matricula;
        this.numKm = numKm;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nomPropietario = nomPropietario;
        this.dniPropietario = dniPropietario;
        
    } // Fin constructor con atributos vehiculo
    
    // Implementamos los getter and setter para cada uno de los atributos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumKm() {
        return numKm;
    }

    public void setNumKm(int numKm) {
        this.numKm = numKm;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNomPropietario() {
        return nomPropietario;
    }

    public void setNomPropietario(String nomPropietario) {
        this.nomPropietario = nomPropietario;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
    
    /**
     * @return antigüedad del vehículo (años transcurridos desde la fecha de 
     * matricualción hasta la fecha actual)
     * 
     * Este método coge la fecha actual y le resta la fecha de
     * matriculación guardada en la variable correspondiente para calcular los 
     * años de antiguedad del mismo
     */
    
    public int get_Anios(){
    
        LocalDate fm = this.fechaMatriculacion;
        LocalDate fa = LocalDate.now();
        
        Period p = Period.between(fm, fa);
        
        return p.getYears();
    
    } // Fin get_Anios
    
} // Final clase vehiculo

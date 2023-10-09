/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package PROG05_Ejerc1_Util; // Nombre de la clase

import java.time.LocalDate;
import PROG05_Ejerc1.Vehiculo;

/**
 *
 * @author diego
 * 
 * Esta clase la (PROG05_Ejerc1_Util) la vamos a usar para crear en ella los 
 * métodos estaticos necesarios para hacer las validaciones
 * En concreto para validar si los km son correctos (es decir, superior a 0)
 * Tambíen crearemos el método para validar que la fecha de matriculación sea
 * correcta (anterior o igual a la fecha actual).
 * Crearemos un método para validar la matricual (que tenga el formato de las
 * matrículas actuales y las letras que permite la DGT como válidas)
 * Crearemos un método en el que validaremos el dni.
 * Crearemos un método para validar el precio (que sea positivo)
 */

public class PROG05_Ejerc1_Util {
    
    /*
     * En este método vamos a validar la fecha. Que los días esten comprendidos
     * entre el 1 y el 31, los meses entre el 1 y el 12 y los años igual o
     * inferiores al año actual
     */
    
    public static boolean validarFecha(int diaIn, int mesIn, int anioIn){
    
        LocalDate hoy = LocalDate.now();
        
        if (diaIn <= 0 || mesIn <= 0 || anioIn <= 0){
        
            return false;
            
        }else if (diaIn <= 31 || mesIn <= 12 || anioIn <= hoy.getYear()){
            
            return true;
            
        } else{
        
           return false;
        
        } // Fin else fechaMayorHoy
    
    } // Fin boolean fechaMayorHoy
    
    /*
     * En este método vamos a validar el DNI para que tenga el formato correcto,
     * (8 números mas 1 letra)
     * Extraemos la letra del DNI introducio y comprobamos, que sea la que le
     * corresponde a los números introducidos.
     */
    
    public static boolean validarDNI(String dniPropietarioIn){
    
        if (dniPropietarioIn.length() !=9){
        
                return false;
        
        } // Fin DNI.length
        
        String DNInum = dniPropietarioIn.substring(0,
                dniPropietarioIn.length() -1);
        char DNILetra = dniPropietarioIn.charAt(dniPropietarioIn.length() -1);
        
        int numDNI;
        
        try{
            
            numDNI = Integer.parseInt(DNInum);
        
        }catch (NumberFormatException e){
            return false;
        }
        
        if (!Character.isAlphabetic(DNILetra)){
        
            return false;
            
        } // Fin if !character
        
        char letrasNIF[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                  'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                  'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        int resto = numDNI % 23;
        
        char DNILetraNuevo = letrasNIF[resto];
        
        String DNINuevo = DNInum + DNILetraNuevo;
        
        if (dniPropietarioIn.equals(DNINuevo)){
    
            return true;
        
        }else{
            
            return false;
            
        } // Fin else
        
    } // Fin boolean validarDNI
    
    /**
     * 
     * @return  true si es positivo, false si es negativo
     * 
     * En esta clase vamos a comprobar que el número de kilometros introducido
     * sea positivo
     */
    
    
    public static boolean validarPrecio(double precioIn){
    
        if (precioIn >= 0){
            
            return true;
            
        }else {
            
            return false;
            
        }
        
    } // Fin validar precio
    
    /*
     * Con el siguiente método vamos a verificar que los kilómetros introducidos
     * seán mayor a 0 y superior a los ya guardado previamente en el caso de
     * actualizarlos
     */
    
    public static boolean validarKm (int kmIn){
        
        Vehiculo v = new Vehiculo();
        
        int kmAct;
        
        kmAct = v.getNumKm();
                
        if (kmIn > 0){
            
            return true;
            
        }else if (kmIn > kmAct){
            
            return true;
            
        }else{
            
            return false;
            
        }
    
    } // Fin validarKm
    
    /* 
     * En el siguiente método vamos a comprobar que la matrícula sea correcta
     * Para ello comprobaremos que empieza por cuadro dígitos númericos
     * comprendidos entre el 0 y 9 y va seguido de tres letras (en mayusculas
     * en este caso) comprendidas entre las utilizadas en las mátriculas
     * actuales
     */
    
    public static boolean validarMatricula (String matriculaIn){
        
        return matriculaIn.matches("^[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}$");
        
    } // Fin boolean validarMatricula
    
} // Fin clase PROG05_Ejerc1_Util

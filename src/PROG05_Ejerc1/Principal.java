/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package PROG05_Ejerc1; // Nombre del paquete

/**
 * Importamos scanner, LocalDate y nuestro PROG05_Ejerc1_Util.PROG05_Ejerc1_Util
 */

import PROG05_Ejerc1_Util.PROG05_Ejerc1_Util;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author diego
 *
 * En esta clase, llamada Principal vamos a ejecutar el método menu creado 
 * en ella
 */

public class Principal { // Inicio clase Principal

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        // Inicio método main
        
        Principal.menu();
        
    } // Fin método main

    /**
     * En este método, llamado menu, vamos a crear todo el programa.
     */
    
    public static void menu(){
        
        /**
         * Declaramos las variables necesarias para el programa e iniciamos las
         * que necesitamos que tengan un valor
         */
        
        Vehiculo v = new PROG05_Ejerc1.Vehiculo();
        int opcion, kmIn, diaIn = 0, mesIn = 0, anioIn = 0;
        String marcaIn, matriculaIn, descripcionIn, nomPropietarioIn,
                dniPropietarioIn;
        double precioIn;
        boolean salir = false;
        
        do{
            
            Scanner sc = new Scanner (System.in);
            
            /**
             * Mostramos el menú que va a ver el usuario por pantalla
             */
            
            System.out.println("Elige una opción entre las siguientes: \n");
            System.out.println("1. Nuevo Vehículo.");
            System.out.println("2. Ver Matrícula.");
            System.out.println("3. Ver Número de Kilómetros.");
            System.out.println("4. Actualizar Kilómetros.");
            System.out.println("5. Ver años de antigüedad.");
            System.out.println("6. Mostrar propietario.");
            System.out.println("7. Mostrar descripción.");
            System.out.println("8. Mostrar precio.");
            System.out.println("9. Salir.\n");
            
            opcion = sc.nextInt(); // Almacenamos la opción elegida
            sc.useDelimiter("\n");
            
            // Creamos el try catch para tratar las excepciones
            
            try{
                
                switch (opcion){
                    
                    case 1: // Nuevo vehiculo
                        
                    /*
                     * En este caso vamos a crear el vehículo pidiendole al
                     * usuario por pantalla los datos necesarios, enviandolos a 
                     * validar a la clase util y, si son correctos, guardandolos
                     * en las variables correspondientes.
                     * Usaremos otro tray catch para tratar las excepciones en 
                     * datos introducidos por el usuario
                     */
                        
                    try{
                        
                        System.out.println("Nuevo vehículo.\n");
                        
                        System.out.println("Introduce la marca:");
                        marcaIn = sc.next();
                        System.out.println("Marca guardada\n");
                        
                        /*
                         * Pedimos la matrícula, la guardamos, y si es válida, 
                         * pasamos al siguiente paso.
                         * En caso contrario lanzamos la excepcion y volvemos
                         * a mostrarle el menú al usuario
                         */
                        
                        System.out.println("Introduce la matrícula:");
                        matriculaIn = sc.next();

                            if (PROG05_Ejerc1_Util.validarMatricula
                                (matriculaIn)){
                                
                                System.out.println("Matrícula guardada\n");
                                
                            }else{
                                
                                throw new Exception ("La matrícula no "
                                        + "es correcta, por favor intruce la "
                                        + "natrícula con el formato: 0000AAA");
                                
                            } // Fin verificar matricula
                            
                        /*
                         * Pedimos los km, los guardamos, y si son válidos, 
                         * pasamos al siguiente paso
                         * En caso contrario lanzamos la excepcion y volvemos a
                         * mostrarle el menú al usuario
                         */
                                                
                        System.out.println("Introduce los kilometros:");
                        kmIn = sc.nextInt();
                        
                            if (PROG05_Ejerc1_Util.validarKm(kmIn)){
                                
                                System.out.println("Kilometros guardados\n");
                                
                            }else {
                                
                                throw new Exception ("\nKilometros "
                                        + "incorrectos. Debe introducir un "
                                        + "número mayor a 0\n");
                                
                            } // Fin chekKm
                            
                        /*
                         * Pedimos el día, el mes y el año de matriculación al
                         * usuario en distintos pasos, los guardamos, los 
                         * validamos en util, y si son válidos, instanciamos una
                         * una nueva variable con la fecha completa y pasamos al
                         * siguiente paso
                         * En caso contrario lanzamos la excepcion y mostramos
                         * el menú al usuario
                         */
                        
                        System.out.println("¿Que día se matriculo?");
                        diaIn = sc.nextInt();
                        System.out.println("Día guardado\n");
                        
                        System.out.println("¿Que mes se matriculo?");
                        mesIn = sc.nextInt();
                        System.out.println("Mes guardado\n");
                        
                        System.out.println("¿Que año se matriculo?");
                        anioIn = sc.nextInt();
                        
                            if (PROG05_Ejerc1_Util.validarFecha(diaIn, 
                                    mesIn, anioIn)){
                                
                                System.out.println("Fecha de matriculación "
                                        + "guardada.\n");
                                
                            }else{
                                
                                throw new Exception ("La fecha de matriculación"
                                        + "no es correcta.");
                                
                            } // Fin validarFecha
                        
                            LocalDate fechaIn = LocalDate.of(anioIn, 
                                    mesIn, diaIn);
                        
                        /* 
                         * Pedimos la descripción del vehículo, y el nombre del
                         * propietario al usuario respectivamente y los
                         * guardamos en sus variables correspondientes
                         */
                        
                        System.out.println("Introduce la descripción del "
                                + "vehículo:");
                        descripcionIn = sc.next();
                        System.out.println("Descripción guardada.\n");
                        
                        System.out.println("Introduce el nombre del "
                                + "propietario");
                        nomPropietarioIn = sc.next();
                        System.out.println("Propietario guardado.\n");
                        
                        /*
                         * Pedimos el DNI al usuario, lo guardamos, lo mandamos
                         * a validar a util y si es correcto pasamos al
                         * siguiente paso.
                         * En caso contrario lanzamos la excepción y volvemos a
                         * mostrar el menú al usuario
                         */
                        
                        System.out.println("Introduce el DNI del"
                                + "propietario");
                        dniPropietarioIn = sc.next();
                        
                            if(PROG05_Ejerc1_Util.validarDNI
                                (dniPropietarioIn)){
                                
                                System.out.println("DNI guardado.\n");
                                
                            }else{
                                
                                throw new Exception ("DNI incorrecto,"
                                        + "por favor introduce el DNI con un"
                                        + "formato válido.");
                                
                            }
                            
                        /*    
                         * Pedimos el precio al usuario, lo guardamos, lo 
                         * validamos en util (que sea mayor que 0) y en caso de
                         * ser valido pasamos al paso siguiente.
                         * En caso contrario lanzamos la excepcion y volvemos a
                         * mostrar el menú al usuario
                         */
                        
                        System.out.println("Introduce el precio del "
                                + "vehículo:");
                        precioIn = sc.nextDouble();
                        
                            if (PROG05_Ejerc1_Util.validarPrecio(precioIn)){
                                
                                System.out.println("Precio guardado\n");
                                
                            }else{
                                
                                throw new Exception ("Precio incorrecto, por "
                                        + "favor introduce el precio correcto");
                                
                            }
                        
                        /*
                         * Si todos los pasos anteriores son válidos
                         * instanciamos todos los datos recogidos en la clase
                         * vehículo usando el metodo set y le mostramos al
                         * usuario el mensaje correspondiente
                         */
                        
                        v.setMarca(marcaIn);
                        v.setMatricula(matriculaIn);
                        v.setNumKm(kmIn);
                        v.setFechaMatriculacion(fechaIn);
                        v.setDescripcion(descripcionIn);
                        v.setNomPropietario(nomPropietarioIn);
                        v.setDniPropietario(dniPropietarioIn);
                        v.setPrecio(precioIn);
                        
                        System.out.println("Vehículo creado con exito");
                        
                    } catch (Exception a){
                        
                        System.out.println(a.getMessage());
                        
                    }// Fin catch 
                    
                    break;
                    
                    /*
                     * En este caso extraemos la matricula guardada en el
                     * vehículo concatenado con la frase correspondiente.
                     * Si no esta creado el vehículo mostramos la excepcion
                     * al usuario
                     */
                    
                    case 2: // Ver matrícula
                        
                        System.out.println("Mostrando matrícula");
                        
                        if (v.getMatricula() == null){
                            
                            throw new Exception ("\nNo tiene creado "
                                    + "ningún vehículo\n");
                            
                        }else{
                            
                            System.out.println("La matrícula del vehículo es: "
                                    + v.getMatricula() + "\n");
                            
                        }
                        
                    break;
                    
                    /*
                     * En este caso mostramos los km al usuario. En caso de ser
                     * 0 querría decir que el vehículo no ha sido creado por lo
                     * lanzamos la excepcion al usuario
                     */
                    
                    case 3: // Ver Número de Kilómetros
                        
                        System.out.println("Mostrando número de Kilómetros");
                        
                        if (v.getNumKm() == 0){
                            
                            throw new Exception ("\nNo tiene creado "
                                    + "ningún vehículo\n");
                            
                        }else{
                            
                            System.out.println("Los kilómetros actuales "
                                    + "del vehículo son: " + v.getNumKm() + 
                                    "KM\n");
                            
                        }
                        
                    break;
                    
                    /*
                     * En este caso actualizamos los km del vehículo y le 
                     * mostramos el mensaje al usuario. 
                     * Para actualizarlos usamos el get correspondiente a los
                     * km y guardamos el dato correspondiente
                     * En caso de que el dato guardado en la variable km sea
                     * igual a 0 quiere decir que el vehículo no esta creado por
                     * lo que lanzaremos la excepción correspondiente
                     * En caso de introducir km inferiores a los ya guardados
                     * lanzamos la excepcion correspondiente.
                     */
                    
                    case 4: //  Actualizar Kilómetros
                        
                        System.out.println("Actualizando kilómetros\n");
                        
                        if (v.getNumKm() == 0){
                            
                            throw new Exception ("No tiene creado ningún "
                                    + "vehículo\n");
                            
                        }else{
                            
                            System.out.println("Introduce los kilómetros "
                                + "actuales:");
                            kmIn = sc.nextInt();
                            
                            if (!PROG05_Ejerc1_Util.validarKm(kmIn)){
                                System.out.println("Kilometros actualizados "
                                + "correctamente\n");
                                
                            }else{
                                
                                System.out.println("\nLos kilómetros "
                                    + "introducidos no son correctos, por favor"
                                    + " introduzca un número superior al "
                                    + "guardado previamente.\n");
                                
                            }
                            
                            v.setNumKm(kmIn);
                            
                        }
                        
                    break;
                    
                    /*
                     * En este caso mostramos los años de antigüedad del 
                     * vehículo. Para ello usamos el método creo en la clase
                     * vehículo, la cual calcula los años transcurridos entre
                     * la fecha guardada en la variable fechaIn y la fecha que
                     * marca el sistema en el momento de calcularlo
                     * En caso de no tener guardada la fecha lanzamos la 
                     * excepción correspondiente y volvemos a mostrar el menú
                     * al usuario
                     */
                    
                    case 5: // Ver años de antigüedad
                        
                        System.out.println("Mostrando años de antigüedad\n");
                        
                        if (v == null){
                            
                            throw new Exception ("\nNo tiene creado "
                                    + "ningún vheículo\n");
                            
                        }else{
                            
                            System.out.println("El vehículo tiene " + 
                                    v.get_Anios() + " años de antiguedad.\n");
                        
                        }
                    
                    break;
                        
                    /*
                     * En este caso mostramos el nombre guardado en la variable
                     * correspondiente.
                     * En caso de ser null la variable, lanzamos la excepcion
                     * correspondiente y volvemos a mostrar el menú al usuario
                     */
                    
                    case 6: // Mostrar propietario
                        
                        System.out.println("Mostrando propietario");
                        
                        if (v.getNomPropietario() == null){
                            
                            throw new Exception ("\nNo tiene creado ningún "
                                    + "vehículo\n");
                            
                        }else{
                            
                            System.out.println("El nombre del propietario es: "
                                    + v.getNomPropietario() + "\n");
                            
                        }
                        
                    break;    
                        
                    /*
                     * En este caso vamos a mostar la descripción del vehículo
                     * que tenemos guardada en la variable correspondiente.
                     * En caso de ser null la variable, lanzamos la excepción
                     * correspondiente y volvemos a mostrar el menú al usuario
                     */
                    
                    case 7: // Mostrar descripción
                        
                        System.out.println("Mostrando descripción");
                        
                        if (v.getDescripcion() == null){
                            
                            throw new Exception ("\nNo tiene creado ningún "
                                    + "vehículo\n");
                            
                        }else{
                            
                            System.out.println("La descripción del vehículo "
                                    + "es: " + v.getDescripcion() + "\n");
                            
                        }
                        
                    break;    
                        
                    /*
                     * En este caso vamos a mostar la descripción del vehículo
                     * que tenemos guardada en la variable correspondiente.
                     * En caso de ser 0 la variable, lanzamos la excepción
                     * correspondiente y volvemos a mostrar el menú al usuario
                     */
                    
                    case 8: // Mostrar precio
                        
                        System.out.println("Mostrando precio");
                        
                        if (v.getPrecio() == 0){
                            
                            throw new Exception ("\nno tiene creado "
                                    + "ningún vehículo\n");
                            
                        }else{
                            
                            System.out.println("El precio del vehículo es de: "
                                    + v.getPrecio() + "€");
                            
                        }
                        
                    break;
                    
                    /*
                     * Este caso lo usamos para salir del programa guardando
                     * true en la variable correspondiente
                     */
                    
                    case 9: // Salir
                        
                        System.out.println("Cerrando el programa. "
                                + "Hasta pronto!.");
                        
                        salir = true;
                        
                    break;    
                    
                }// Fin switch
            
            } catch (Exception b){
                
                System.out.println(b.getMessage());
                
            }// Fin try
                        
        }while(salir != true);// Fin do

    } // Fin menu
    
} // Fin clase principal
        
        
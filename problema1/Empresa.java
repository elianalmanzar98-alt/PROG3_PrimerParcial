

import java.util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




public class Empresa {
    
    private static final char[] Salarioempleados = null;

    public static char[] main(String[]args){
    
        Iterator<String> sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
            
        Scanner  opcion = new Scanner(System.in);

        do{
            System.out.println("----------------Menu------------------");
            System.out.println("1). Registrar empleado tiempo completo  ");
            System.out.println("2). Registrar segundo empleado tiempo completo ");
            System.out.println("3). Mostrar salarios ");
            System.out.println("4). Registrar empleado medio tiempo");
            System.out.println("5). Registrar segundo empleado medio tiempo");
            System.out.println("6). Mostrar salarios empleados medio tiempo ");
            System.out.println("7). Calacular nomina de todos los empleados");
            System.out.println("0). Salir del menu");
            System.out.println("Escoja una opcion: ");

             opcion = sc.next();
             ((Scanner) sc).nextInt();
             
             
             switch (opcion) {
                case 1:
                   System.out.println("Digite el nombre del empleado de tiempo completo: ");
                   String nombre = sc.next();
                   System.out.println("Sueldo base del empleado tiempo completo: ");
                    int sueldoempleados;
                    int bono;
                    int salariobase = sueldoempleados + bono;
                  
                    break;


                case 2:
                    System.out.println("Digite el nombre del segundo empleado de tiempo completo: ");
                    String nombre1 = sc.next();
                    System.out.println("Digite el sueldo del segundo empleado a tiempo completo: "); 
                    double sueldo = sc.next();

                    break;


                switch (opcion) {
                    case 3 :
                        System.out.println(Salarioempleados);
                        return Salarioempleados;

                        break;
                }    

                switch (opcion) {
                    case 4:
                        System.out.println("Digite el nombre del empleado de medio tiempo: ");
                        String nombre = sc.next();
                        return nombre2;
                        
                        break;


                }
                switch (opcion) {
                    case 5:
                        System.out.println("Digite el nombre del segundo empleado medio tiempo: ");
                        String nombre = sc.next();

                        break;
            
                }
                switch (opcion) {
                    case 6:
                        char[] salariobasemediotiempo;
                        System.out.println(salariobasemediotiempo);
                         return salariobasemediotiempo;
                        break;
                }
             switch (opcion) {
                case 7:
                    



                    break;
             
                
             }
             switch (opcion) {
                case 0:
                    System.out.println("Saliendo del menu...");
                    break;
             
                
             }
             
            
             }   
             }
            

        }

            
        }
    



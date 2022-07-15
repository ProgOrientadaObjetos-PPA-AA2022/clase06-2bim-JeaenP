/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Enlace c = new Enlace();
        int op = 1;
        while ( op != 0) {
            System.out.println("1) Ingresar nueva ciudad en la base de datos");
            System.out.println("0) Salir");
            op = sc.nextInt();
            sc.nextLine();
            if ( op == 1) {
                System.out.println("Ingrese el nombre de la ciudad:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese la poblacion de la ciudad:");
                int id = sc.nextInt();
                Ciudad ciudad = new Ciudad(nombre , id );
                c.insertarCiudad(ciudad);
            }
        }
        
      
    }
}

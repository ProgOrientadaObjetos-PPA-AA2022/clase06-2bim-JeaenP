/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

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
            System.out.println("1) Ingresar nuevo auto en la base de datos");
            System.out.println("0) Salir");
            op = sc.nextInt();
            sc.nextLine();
            if ( op == 1) {
                System.out.println("Ingrese la placa del vehiculo");
                String placa = sc.nextLine();
                System.out.println("Ingrese el valor de matricula del vehiculo:");
                double valor = sc.nextInt();
                Auto a = new Auto();
                a.establecerPlaca(placa);
                a.establecerValorMatricula(valor);
                c.insertarAuto(a);
            }
        
        }
    }
}
        
        
        
        
    


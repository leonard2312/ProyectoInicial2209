/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;

/**
 *
 * @author leona
 */
public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1= new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Juan Jose");
        emp1.setApPaterno("García");
        emp1.setApMaterno("Bolaños");
        emp1.setEdad(24);
        emp1.setCurp("GABJ21215475");
        
        System.out.println("info:" + emp1);
    }
}

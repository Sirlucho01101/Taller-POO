/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio1;

/**
 *
 * @author Ambiente
 */
public class EjecutableCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Cuenta Cuenta1 = new Cuenta("Diana", 500);
    	Cuenta Cuenta2 = new Cuenta("Jairo", 200);
    	
    	Cuenta1.ingresarCantidad(200);
    	Cuenta2.ingresarCantidad(800);
    	
    	Cuenta1.retirarCantidad(300);
    	Cuenta2.retirarCantidad(1000000000);
    	
    	System.out.print(Cuenta1);
    	System.out.print(Cuenta2);
    }
    
}

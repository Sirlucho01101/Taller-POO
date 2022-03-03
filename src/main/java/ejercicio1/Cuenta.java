/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Ambiente
 */
public class Cuenta {
    /*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad
    (puede tener decimales).
    El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo
    anterior.
    Crea sus métodos get, set y toString.
    Tendrá dos métodos especiales:*/
    String titular;
    double cantidad=13.5;
    //Constructores
    public Cuenta(String titular){
        this.titular = titular;
    }
    public Cuenta(String titular,double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    //getter y setter de titular
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    //getter y setter de cantidad
    public double getCantidad(){
        return cantidad;
    }
        public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    } 
        /*● ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
         introducida es negativa, no se hará nada.*/
        public double ingresarCantidad(double cantidadi){
            if(cantidadi<0){
            	this.cantidad=0;
            }else{
            	this.cantidad=this.cantidad+cantidadi;
            }
            return this.cantidad; 
            }
        /*    ● retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad
    actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.*/
        public double retirarCantidad(double cantidadr){
            double resta = this.cantidad-cantidadr;
            if(resta<0){
            	this.cantidad=0;
            }else{
                //Hacer una variable que almacene el valor de la cuenta
            	this.cantidad=this.cantidad-cantidadr;
            }
            return this.cantidad; 
        }
        /*metodo contarRegulares
    public int contarRegulares(){
    int regular=0;
    if(nota>2.5 && nota<=3.5){
        regular=regular+1;
    }
    return regular;
    }*/
        @Override
        public String toString() {
            return "Cuenta{titular="+this.titular + ", Cantidad=" + this.cantidad + '}';
        }
}

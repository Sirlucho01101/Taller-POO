/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;
import java.util.Random;

/**
 *
 * @author Ambiente
 */
public class Persona {
    /*Haz una clase llamada Persona que siga las siguientes condiciones:
● Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No
queremos que se accedan directamente a ellos. Piensa que modificador de acceso
es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes
hacerlo.
● Por defecto, todos los atributos menos el DNI serán valores por defecto según su
tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa
una constante para ello.
    */
    String nombre;
    int edad=0;
    int dni;
    private final char sexodef='H';
    private char sexo;//Sexo de H o M
    float peso=0;
    float altura=0;
    //constructor
    /*Se implantaran varios constructores:
    ○ Un constructor por defecto.
    */
    public Persona(){}
    //○ Un constructor con el nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad,char sexo){
    this.nombre=nombre;
    this.edad=edad;
    this.sexo=sexo;            

    }
    // ○ Un constructor con todos los atributos como parámetro.
    public Persona(String nombre, int edad,int dni,char sexo,float peso,float altura){
    this.nombre=nombre;
    this.edad=edad;
    this.dni=dni;
    this.sexo=sexo;
    this.peso=peso;
    this.altura=altura;
    }
    //getter y setter de nombre
    protected String nombre(){
        return nombre;
    }
    protected void setNombre(String nombre){
        this.nombre=nombre;
    }
    //getter y setter de edad
        protected int getEdad(){
        return edad;
    }
    protected void setEdad(int edad){
        this.edad=edad;
    }
    //getter y setter de DNI
        protected int getDNI(){
        return dni;
    }
    protected void setDNI(int dni){
        this.dni=dni;
    }
    //getter y setter de sexo
        protected char getSexo(){
        return sexo;
    }
    protected void setSexo(char sexo){
        this.sexo=sexo;
    }
    //getter y setter de peso
    protected float getPeso(){
        return peso;
    }
    protected void setPeso(float peso){
        this.peso=peso;
    }
    //getter y setter de altura
    protected float getAltura(){
        return altura;
    }
    protected void setAltura(float altura){
        this.altura=altura;
    }
/*
    ● Los métodos que se implementarán son:
    ○ calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, la
    función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
    significa que está por debajo de su peso ideal la función devuelve un 0 y si
    devuelve un valor mayor que 25 significa que tiene sobrepeso, la función
    devuelve un 1. Te recomiendo que uses constantes para devolver estos
    valores.*/
     public float calcularIMC(){
         float IMC =this.peso/(this.altura*this.altura);
         final float resultado;
            if(IMC<20){
            	resultado=-1;
            }else if(IMC>=20 && IMC<25){
            	resultado=0;
            }else{
                resultado=1;
            }
            return resultado; 
            }
    /*■ esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.*/
     public boolean esMayorDeEdad(){
         boolean medad;
         if(this.edad>18){
             medad=true;
         }else {
         medad=false;
         }
         return medad;         
     }
    /*■ comprobarSexo(char sexo): comprueba que el sexo introducido es
    correcto. Si no es correcto, será H. No será visible al exterior.*/
     public char comprobarSexo(char sexo){
         if(sexo=='H'){
             this.sexo=sexodef;
         }else{
             this.sexo='M';
         }
             return this.sexo;
             }
    /*■ toString(): devuelve toda la información del objeto.
     nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura
     */
     @Override
        public String toString() {
            return "Cuenta{nombre="+this.nombre + ", edad=" + this.edad + ", dni=" + this.dni + ", sexo=" + this.sexo + ", peso=" + this.peso + ", altura=" + this.altura + '}';
        }
    /*■ generaDNI(): genera un número aleatorio de 8 cifras, genera a partir
    de este su número su letra correspondiente. Este método será
    invocado cuando se construya el objeto. Puedes dividir el método
    para que te sea más fácil. No será visible al exterior.*/
     public int generaDNI(){
        int value = (int) (Math.random()*99999999);
     }
 /*
■ Métodos set de cada parámetro, excepto de DNI.

Ahora, crea una clase ejecutable que haga lo siguiente:
● Pide por teclado el nombre, la edad, sexo, peso y altura.
● Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables
pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso
y la altura y el último por defecto, para este último utiliza los métodos set para darle
a los atributos un valor.*/
}

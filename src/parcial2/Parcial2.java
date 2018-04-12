/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ojo
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuentas[] = new Cuenta[5];
        ArrayList<Cuenta> cuentas2 = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        
        String nombre,documento,numero;
        int edad;
        double peso, altura;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre");
            nombre = leer.next();
            
            System.out.println("Ingrese edad");
            edad = leer.nextInt();
            
            System.out.println("Ingrese documento");
            documento = leer.next();
            
            System.out.println("Ingrese peso");
            peso = leer.nextDouble();
            
            System.out.println("Ingrese altura");
            altura = leer.nextDouble();
            
            Persona persona = new Persona(nombre, edad, documento, peso , altura);
            
            System.out.println("Ingrese numero de la cuenta");
            numero = leer.next();
            Cuenta cuenta = new Cuenta(persona, numero);
            cuentas[i] = cuenta;
            cuentas2.add(cuenta);
            
            
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author ojo
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String documento;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String documento, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.peso = peso;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    public void calcularIMC(){
        double imc = peso/(altura * altura);
        if(imc<20){
            System.out.println("Peso Ideal!!");
        }else if(imc< 25){
            System.out.println("Infrapeso!!");
        }else{
            System.out.println("Sobrepeso!!");
        }
    }
    
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
    
}

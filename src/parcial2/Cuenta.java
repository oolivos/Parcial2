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
public class Cuenta {
    private Persona titular;
    private String numero;
    private double saldo;
    
    
    public Cuenta(Persona titular, String numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consignar(double valor){
        saldo+=valor;
        System.out.println("Transaccion exitosa!!");
    }
    
    public void retirar(double valor){
        if(saldo>valor){
            saldo-=valor;
            System.out.println("Transaccion exitosa!!");
        }else{
            System.out.println("Saldo Insuficiente!!");
        }
    }
    
    
}

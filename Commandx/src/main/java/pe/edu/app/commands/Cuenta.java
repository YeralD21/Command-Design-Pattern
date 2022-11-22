/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.app.commands;

/**
 *
 * @author ACER ASPIRE
 */
public class Cuenta {
    private int id;
    private double saldo;
    
    public Cuenta(int id, double saldo){
        this.id = id;
        this.saldo = saldo;                
    }
    public void retirar(double monto){
        this.saldo = this.saldo - monto;
        System.out.println("[COMANDO RETIRAR] Cuenta: " + id +  " Saldo: " + this.saldo);
    }
    
    public void depositar(double monto){
        this.saldo = this.saldo + monto;
        System.out.println("[COMANDO DEPOSITAR] Cuenta: " + id +  " Saldo: " + this.saldo);
    }
}

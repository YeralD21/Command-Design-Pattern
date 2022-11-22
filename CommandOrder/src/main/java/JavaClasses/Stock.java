/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaClasses;

/**
 *
 * @author ACER ASPIRE
 */
public class Stock {
    
    private String name = "WheyProtein";
    private int quantity = 30;

    public void buy() {
        System.out.println("Stock [ Name: " +name+ "), Cantidad: " + quantity +" ] comprado");
    }
    
    public void sell(){
        System.out.println("Stock [ Name: " +name+ "), Cantidad: " + quantity +" ] vendido");
    }
    
    
}

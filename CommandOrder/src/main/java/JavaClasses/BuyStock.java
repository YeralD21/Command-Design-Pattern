/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaClasses;

/**
 *
 * @author ACER ASPIRE
 */
public class BuyStock implements Order{
    private Stock abcStock;
    
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    
    
    
    @Override
    public void execute() {
        abcStock.buy();
    }
   
}

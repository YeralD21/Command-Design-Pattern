/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package classes.commandorder;

import JavaClasses.Broker;
import JavaClasses.BuyStock;
import JavaClasses.SellStock;
import JavaClasses.Stock;

/**
 *
 * @author ACER ASPIRE
 */
public class CommandOrder {

    public static void main(String[] args) {
     
        Stock abcStock = new Stock();
        
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        
        broker.placeOrders();
        
    }
}

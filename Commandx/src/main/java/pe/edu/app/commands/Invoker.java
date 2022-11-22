/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.app.commands;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER ASPIRE
 */
public class Invoker {
    
    private List<OperacionI> operaciones = new ArrayList<>();
    
    public void recibirOperacion(OperacionI operacion){
        this.operaciones.add(operacion);
    }
    
    public void realizarOperaciones(){
        
        this.operaciones.forEach(x -> x.execute());
        this.operaciones.clear();
    }
}
 
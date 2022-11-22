/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.app.commandx;

import pe.edu.app.commands.Cuenta;
import pe.edu.app.commands.DepositarImpl;
import pe.edu.app.commands.Invoker;
import pe.edu.app.commands.RetirarImpl;

/**
 *
 * @author ACER ASPIRE
 */
public class Commandx {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta (1, 200);
        
        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);
        
        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);
        
        ivk.realizarOperaciones();
    }
}

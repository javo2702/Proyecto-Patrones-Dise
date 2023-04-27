/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.strategy.artifacts;

import java.time.LocalDate;
import java.time.LocalTime;
import patron.strategy.ILoginStrategy;

/**
 *
 * @author PC
 */
public class LoginContext {
    private ILoginStrategy strategy;
    
    public void setStrategy (ILoginStrategy strategy){
        this.strategy = strategy;
    }
    
    public void login(){
        System.out.println("Login Time: " + LocalTime.now());
        System.out.println("Login date: " + LocalDate.now());
        this.strategy.login();
    }
}

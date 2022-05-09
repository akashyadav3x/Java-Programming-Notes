/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethod3;

/**
 *
 * @author dell
 */
public class MyGreetings implements Greet1,Greet2 {

    @Override
    public void greetings() {
        System.out.println("Good Night!");
        Greet1.super.greetings();
        Greet2.super.greetings();
    }
    
}

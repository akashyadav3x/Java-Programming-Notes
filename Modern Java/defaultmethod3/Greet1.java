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
public interface Greet1 {
    default public void greetings()
    {
        System.out.println("Good Morning!");
    }
}

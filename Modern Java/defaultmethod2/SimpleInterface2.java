/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethod2;

/**
 *
 * @author dell
 */
public interface SimpleInterface2 extends SimpleInterface1 {
    default void method1()
    {
        System.out.println("Inside SimpleInterface2 method1");
    }
}

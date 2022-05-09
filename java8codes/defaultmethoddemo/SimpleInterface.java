/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethoddemo;

/**
 *
 * @author dell
 */
public interface SimpleInterface {
    void method1();
    default void method2()
    {
        System.out.println("Inside SimpleInerface method2");
    }
}

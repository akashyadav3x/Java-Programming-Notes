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
public class SimpleImpl implements SimpleInterface {

    @Override
    public void method2() {
        System.out.println("Inside SmpleImpl method2");
    }

    @Override
    public void method1() {
        System.out.println("Inside SimpleImpl method 1");
    }
    
}

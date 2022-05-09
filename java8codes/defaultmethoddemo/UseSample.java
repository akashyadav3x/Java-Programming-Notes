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
public class UseSample {
    public static void main(String[] args) {
        SimpleInterface obj=new SimpleImpl();
        obj.method1();
        obj.method2();
    }
}

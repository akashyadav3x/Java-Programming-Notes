/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples1;

/**
 *
 * @author dell
 */
public class UsGreetings2 {
    public static void main(String[] args) {
        Greetings gr=()->"Good Morning";
        System.out.println(gr.greet());
        
        
    }
   
}

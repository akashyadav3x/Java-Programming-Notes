/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambaexamples6;

import java.util.function.Function;

/**
 *
 * @author dell
 */
public class Example1 {
    public static void main(String[] args) {
        Function<String,String> fn=(fullname)->fullname.split(" ")[0];
        System.out.println(fn.apply("Sachin Kapoor"));
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples5;

import java.util.function.Predicate;

/**
 *
 * @author dell
 */
public class UsePredicate2 {
    public static void main(String[] args) {
        Predicate <String>p=(str)->new StringBuffer(str).reverse().toString().equals(str);
        System.out.println("Is NITN palindrome ?"+p.test("NITIN"));
        System.out.println("Is SACHIN palindrome?"+p.test("SACHIN"));
    }
}

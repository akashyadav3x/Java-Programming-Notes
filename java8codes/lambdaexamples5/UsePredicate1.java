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
public class UsePredicate1 {
    public static void main(String[] args) {
        Predicate <Integer> p=n->n%2==0;
        System.out.println("Is 10 even ?"+p.test(10));
        System.out.println("Is 15 even ?"+p.test(15));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author dell
 */
public class UsePredicate3 {
    public static void main(String[] args) {
        Predicate <Integer>p=(n)->n>0;
         List<Integer> myList=Arrays.asList(-10,-5,25,12,-2);
         for(Integer obj:myList)
         {
             if(p.test(obj))
                 System.out.println(obj);
         }
        
    }
}

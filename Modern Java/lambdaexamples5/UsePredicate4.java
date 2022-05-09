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
public class UsePredicate4 {
    public static void main(String[] args) {
        List <Integer> myList=Arrays.asList(24,10,15,18,1,6,12,11);
        System.out.println("Showing multiples of 2");
        Predicate <Integer>p1=(n)->n%2==0;
        apply( p1, myList);
        System.out.println("Showing multiples of 3");
        Predicate <Integer>p2=(n)->n%3==0;
        apply(p2, myList);
        System.out.println("Showing multiples of both 2 and 3");
        apply( p1.and(p2), myList);
    }
    public static void apply(Predicate<Integer>p,List<Integer>myList)
    {
        for(Integer obj:myList)
        {
            if(p.test(obj))
                System.out.println(obj);
        }
        System.out.println("-----------------------------");
        
    }
}

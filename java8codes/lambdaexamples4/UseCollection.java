/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class UseCollection {
    public static void main(String[] args) {
        List<Integer> myList=Arrays.asList(10,5,25,12,2);
        System.out.println("Before sorting:"+myList);
        Collections.sort(myList,(obj1,obj2)->obj2-obj1);
        System.out.println("After sorting:"+myList);

    }
}

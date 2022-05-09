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
public class Example2 {
    public static void main(String[] args) {
       
        Function <String[],String>fn=names->{
             StringBuilder sb=new StringBuilder();
             for(String s:names)
             {
                 sb.append(s.split(" ")[0]+"\n");
                 
             }
             return sb.toString();
            
        };
        String []actors={"Hrithik Roshan","Tiger Shroff","Amir Khan"};
        System.out.println(fn.apply(actors));
    }
}

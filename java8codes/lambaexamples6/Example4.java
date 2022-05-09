/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambaexamples6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Empl
{

    
    public String getName() {
        return name;
    }

    public int getProjectsDone() {
        return projectsDone;
    }

    

    public Empl(String name, int projectsDone) {
        this.name = name;
        this.projectsDone = projectsDone;
       
    }
    private String name;
    private int projectsDone;
    
    
}


public class Example4 {
    public static void main(String[] args) {
       
        List<Empl> empList=Arrays.asList(
                new Empl("Sumit",4),
                new Empl("Vikas",8),
                new Empl("Deepak",2),
                new Empl("Ankit",6),
                new Empl("Arjun",1),
                new Empl("Rakesh",0));
        Predicate <Empl> pr=(e)-> e.getProjectsDone()>2;
        
        Function <Empl,Character> getGrade=e->{
            char grade;
           if(e.getProjectsDone()>5)
               grade='A';
           else 
               grade='B';
           
           
            return grade;
            
        };
      Consumer <Empl> cr=(e)->{
                 if(pr.test(e))
                 {
                     System.out.println("Name:"+e.getName());
                     System.out.println("Projects done:"+e.getProjectsDone());
                     System.out.println("Grade:"+getGrade.apply(e));
                 }
      };
      processList(empList,cr);
       
    }

    private static void processList(List<Empl> empList, Consumer<Empl> cr) {
        for(Empl e: empList)
        {
            cr.accept(e);
        }
    }

    
}

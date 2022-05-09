/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambaexamples6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getProjectsDone() {
        return projectsDone;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int projectsDone, double salary) {
        this.name = name;
        this.projectsDone = projectsDone;
        this.salary = salary;
    }
    private String name;
    private int projectsDone;
    private double salary;
    
}


public class Example3 {
    public static void main(String[] args) {
       
        List<Employee> empList=Arrays.asList(
                new Employee("Sumit",4,50000.0),
                new Employee("Vikas",8,150000.0),
                new Employee("Deepak",2,40000.0),
                new Employee("Ankit",6,100000.0),
                new Employee("Arjun",1,20000.0),
                new Employee("Rakesh",0,10000.0));
        Function <Employee,Character> getGrade=e->{
            char grade;
           if(e.getProjectsDone()>5)
               grade='A';
           else if(e.getProjectsDone()>=3)
               grade='B';
           else if(e.getProjectsDone()>0)
               grade='C';
            else
               grade='D';
           
            return grade;
            
        };
        Predicate <Character> checkGrade=grade-> grade=='A' || grade=='B';
        process(empList,getGrade,checkGrade);
    }

    private static void process(List<Employee> empList, Function<Employee, Character> grade,Predicate<Character>cg ){
        for(Employee e:empList)
        {
            System.out.print("Name:"+e.getName());
            System.out.print(" Projects done:"+e.getProjectsDone());
            Character gr=grade.apply(e);
            System.out.print(" Grade:"+gr);
            System.out.print(" Salary:"+e.getSalary());
            if(cg.test(gr))
            {
                e.setSalary(e.getSalary()+e.getSalary()*0.1);
                System.out.println(" New Salary:"+e.getSalary());
            }
            System.out.println("");
        }
    }
}

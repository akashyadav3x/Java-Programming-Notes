/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopsl.innerclass;
class Voter
{
    private String name;
    private int age;
    
    private Voter(String name,int age)
    {
        if(age>=18)
        {
        this.name=name;
        this.age=age;
        }
    }
    public static class VoterInstance
            {
    public static Voter buildVoter(String name,int age)
    {
       Voter v=null;
        if(age>=18)
        {
          v=new Voter(name,age);
        }
        
            return v;
    }
}
    public String toString()
    {
        return "Voter details\nname:"+name+",age:"+age;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Voter v1=Voter.VoterInstance.buildVoter("Ravi",19);
        Voter v2=Voter.VoterInstance.buildVoter("Gagan",15);
        System.out.println(v1);
        System.out.println(v2);
    }
}

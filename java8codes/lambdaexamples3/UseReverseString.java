/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples3;

@FunctionalInterface
interface ReverseString
{
    String reverse(String str);
}
public class UseReverseString {
    public static void main(String[] args) {
        ReverseString rev=(str)->{
                                      StringBuilder sb=new StringBuilder();
                                      for(int i=str.length()-1;i>=0;i--)
                                      {  
                                             sb.append(str.charAt(i)); 
                                      }
                                      return sb.toString();
            
                                 };
        System.out.println("Reverse of Bhopal is "+rev.reverse("Bhopal"));
    }
}
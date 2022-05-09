/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples2;
@FunctionalInterface
interface NumTest
{
    boolean isEven(int n);
}
public class UseNumTest {
    public static void main(String[] args) {
        NumTest nt=(n)->n%2==0;
        System.out.println("2 is even:"+nt.isEven(2));
        System.out.println("5 is even:"+nt.isEven(5));
    }
}

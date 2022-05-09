/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples2;
@FunctionalInterface
interface ReverseString
{
    String reverse(String str);
}
public class UseReverseString {
    public static void main(String[] args) {
        ReverseString rev=(str)->new StringBuffer(str).reverse().toString();
        System.out.println("Reverse of Bopal is "+rev.reverse("Bhopal"));
    }
}

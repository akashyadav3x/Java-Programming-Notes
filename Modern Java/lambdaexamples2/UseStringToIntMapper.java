/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples2;
@FunctionalInterface
interface StringToIntMapper
{
    int map(String str);
}
public class UseStringToIntMapper {
    public static void main(String[] args) {
        StringToIntMapper sim=str->str.length();
        System.out.println("Length of Bhopal is "+sim.map("BHopal"));
        
        
        
    }
}

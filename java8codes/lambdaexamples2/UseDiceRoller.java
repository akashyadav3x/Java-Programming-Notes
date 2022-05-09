/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples2;

@FunctionalInterface
interface DiceRoller
{
    int rollDice();
}
public class UseDiceRoller {
    public static void main(String[] args) {
        DiceRoller dr=()-> (int)(Math.random()*6)+1;
        System.out.println("Dice rolled:"+dr.rollDice());
        System.out.println("Dice rolled:"+dr.rollDice());
    }
}

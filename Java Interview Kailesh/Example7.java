/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopsl.innerclass;

class A
{
    int y=20;
    public void m1()
    {
        final int x=10;
        class Sachin
        {
            int z=30;
            public void show()
            {
                System.out.println(y);
                System.out.println(z);
                System.out.println(x);
            }
        }
        Sachin s=new Sachin();
        s.show();
    }
}
public class Example7 {
    public static void main(String[] args) {
        A obj=new A();
        obj.m1();
    }
}

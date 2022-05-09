/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopsl.innerclass;

class Outer
{
    int x=10;
     class Inner
    {
        int x=20;
        public void show()
        {
            System.out.println(Outer.this.x);
            System.out.println(this.x);
        }
    }
}


public class Example6 {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer().new Inner();
        obj.show();
    }
}

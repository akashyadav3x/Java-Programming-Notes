/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopsl.innerclass;
class Shape
{
    private static String name="Polygon";
    static class Point
    {

        public Point(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
        public String toString()
        {
            String str=name;
            return "red:"+red+",green:"+green+",blue:"+blue;
        }
        private int red,green,blue;
        
    }
}

public class Example1 {
    public static void main(String[] args) {
        
        Shape.Point p=new Shape.Point(100,150,200);
        System.out.println(p);
    }
}

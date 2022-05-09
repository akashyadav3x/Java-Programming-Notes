/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopsl.innerclass;
class MyCircle
{
    private int rad;
    private Point p;
    public  MyCircle(int xpos,int ypos,int rad)
    {
        this.rad=rad;
        p=new Point(xpos,ypos);
    }
    
    public String toString()
    {
        String str="xpos="+p.xpos+"ypos="+p.ypos+"rad="+rad;
        return str;
    }
    class Point
    {
        private int xpos,ypos;
        public Point(int xpos,int ypos)
        {
            this.xpos=xpos;
            this.ypos=ypos;
        }
//        public String toString()
//        {
//            return "rad="+rad+",xpos="+xpos+",ypos="+ypos;
//        }
    }
    
}
public class Example5 {
    public static void main(String[] args) {
        MyCircle obj=new MyCircle(10,20,30);
        System.out.println(obj);
    }
}

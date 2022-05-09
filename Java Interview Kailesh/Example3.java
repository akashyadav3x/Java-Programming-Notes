/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopsl.innerclass;
class Circle {
class Point {

private int xPos;
private int yPos;
public Point(int x, int y) {
xPos = x;
yPos = y;
}
public String toString() {
return "(" + xPos + "," + yPos + ")";
}
}
private Point center;
private int radius;
public Circle(int x, int y, int r) {
center = new Point(x, y);
radius = r;
}
public String toString() {
return "mid point = " + center + " and radius = " + radius;
}
}
public class Example3 {
    public static void main(String[] args) {
        Circle obj=new Circle(10,20,30);
        System.out.println(obj);
    }
}

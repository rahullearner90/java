// 1.Constructor Overloading:
class Rectangle
{
private int l,b;
public Rectangle()
{
l=b=10;
}
public Rectangle(int x)
{
l=b=x;
}
public Rectangle(int x,int y)
{
l=x;
b=y;
}
public void display()
{
System.out.println("Area = "+l*b);
}
}
class Main {
public static void main(String[] args) {
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle(5);
Rectangle r3=new Rectangle(3,3);
r1.display();
r2.display();
r3.display();
}
}
A) 2.Method Overloading
class Area
{
private float x,y,z;
public float Area(float r)
{
return(3.14f*r*r);
}
public float Area(float l,float b)
{
return(l*b);
}
public float Area(float a,float b,float c)
{
float s;
s=(a+b+c)/2;
s=s*(s-a)*(s-b)*(s-c);
return(float)(Math.sqrt(s));
}
}
class Main {
public static void main(String args[]) {
Area a=new Area();
System.out.println("Area of circle is: "+a.Area(10));
System.out.println("Area of circle is: "+a.Area(10,10));
System.out.println("Area of circle is: "+a.Area(10,10,10));
}
}
A) 3.Static Method
import java.io.*;
public class GFG {
static int a = 40;
int b = 50;
void simpleDisplay()
{
System.out.println(a);
System.out.println(b);
}
static void staticDisplay()
{
System.out.println(a);
}
}
class Main {
public static void main(String[] args)
{
GFG obj = new GFG();
obj.simpleDisplay();
obj.staticDisplay();
}
}
B) Inheritance and Method Overriding
class Grandpa {
public void show()
{
System.out.println("Inside show() method of Grandpa class");
}
}
class Dad extends Grandpa {
@Override public void show()
{
System.out.println("Inside show() method of Dad class");
}
}
class Me extends Dad {
@Override public void show()
{
System.out.println("Inside show() method of Me class");
}
}
public class Main {
public static void main(String[] args)
{
Grandpa grandpa = new Grandpa();
Grandpa dad = new Dad();
Grandpa me = new Me();
grandpa.show();
dad.show();
me.show();
}
}
package Interfaces;
// Multiple Inheritance : When one class extends more than one classes.

public interface Shapes {

    double pi = 3.14;
    void cal(float c1, float c2);
}
class Rectangle implements Shapes
{
    public void cal(float a, float b)
    {
        System.out.println(a*b);
    }
}
class Circle implements Shapes
{
    public void cal(float a, float b)
    {
        System.out.println(pi*a*b);
    }
}
class MultipleInheritance
{
    public static void main(String[] args)
    {
       Shapes s;
       Rectangle r = new Rectangle();
       Circle c = new Circle();
       s = r;
       s.cal(20,4);
       s = c;
       s.cal(10,3);

    }
}

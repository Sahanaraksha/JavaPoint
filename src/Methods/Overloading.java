package Methods;
// Method Overloading : A class which have multiple methods having same name but different in parameters.
public class Overloading {
    public int mul (int a,int b)       //Overloaded multiply Takes two parameters
    {
        return (a * b);
    }

    public int mul(int a,int b,int c)
    {
        return (a * b * c);              //Takes three parameters
    }

    public double mul(double a,double b)
    {
        return (a * b);
    }

    public double mul(double a,double b,double c)
    {
        return (a * b * c);
    }

    public static void main(String[] args)
    {
        Overloading s = new Overloading();
        System.out.println(s.mul(20, 50));
        System.out.println(s.mul(20, 40, 60));
        System.out.println(s.mul(20.5, 50.5));
        System.out.println(s.mul(30.5, 40.5, 50.5));

    }
}

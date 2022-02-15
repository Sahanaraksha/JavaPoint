package Loops;

public class Pyramid {
    public static void main(String args[])
    {
        for(int r =1; r<=6;r++)
        {
            for(int t=1;t<=r;t++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

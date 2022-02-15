package Loops;
// Do while Loop : do while loop is similar to while loop with only difference that it checks for condition
// after executing the statements, and therefore is an example of Exit Control Loop.

public class DoWhile {
    public static void main(String args[])
    {
        int a = 58;
        do
        {
            // The line will be printed even
            // if the condition is false
            System.out.println("Value of a:" + a);
            a++;
        }
        while (a < 20);
    }
}


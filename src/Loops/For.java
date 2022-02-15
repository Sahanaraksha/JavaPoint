package Loops;

// For Loop : A for statement consumes the initialization, condition and increment/decrement in
// one line thereby providing a shorter, easy to debug structure of looping.

public class For {
    public static void main(String args[])
    {
        int loopValue;
        int endValue = 10;

        for(loopValue = 0; loopValue < endValue; loopValue++ )
        {
            System.out.println("Loop Value is : " + loopValue);
        }
    }
}

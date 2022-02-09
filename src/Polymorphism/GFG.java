package Polymorphism;


class Sum{
    // Method 1
    static int Addition(int sum1, int sum2 )
    { // addition of two numbers
        return sum1 + sum2; // return sum

    }
    // Method 2
    static int Addition(int sum1,int sum2,int sum3)
    {    // addition of three numbers

        return sum1 + sum2 + sum3; // return sum
    }
}

public class GFG {
    // Main Driver method
    public static void main(String args[]){
        // Calling method by passing
        // input as in arguments
        System.out.println(Sum.Addition(65,78));
        System.out.println(Sum.Addition(77,81,78));
    }
}

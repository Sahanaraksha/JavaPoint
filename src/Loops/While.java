package Loops;

// While loop :A while loop is a control flow statement that allows code to be executed
// repeatedly based on a given Boolean condition.

public class While {
    public static void main(String args[]) {
        int i = 1;

        // Exit when x becomes greater than 4
        while (i <= 6) {
            System.out.println("Value of i:" + i);

            // Increment the value of x for
            // next iteration
            i++;
        }
    }
}
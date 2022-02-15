package ExceptionHandler;

// ArrayIndexOutOfBoundsException : Its to indicate that the array has been accessed with an illegal index.
// The index is either negative or greater than or equal to the size of an array.

public class ArrayIndexException {
    public static void main (String[] args)
    {
        int[] a  = new int[3];
        a[0] = 10;
        a[1] = 20;

        for (int b = 0; b <= a.length; b++)
            System.out.println(a[b]);
    }
}


package Array;

public class ArrayMatrix {
    public static void main(String args[])
    {
        // declaring and initializing 2D array
        int arr1[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};
        int arr2[][] = {{3, 6, 8}, {5, 8, 6}, {8, 6, 4}};
        int arr3[][] = new int[3][3]; // to store the result

        for(int r = 0; r<3;r++)
        {
            for(int t=0; t<3; t++)
            {
                arr3[r][t] = 0;
                for(int s=0; s<3; s++)
                {
                    arr3[r][t] = arr1[r][s] * arr2[s][t];
                }
                System.out.println("the result of matrix is : " + arr3[r][t]+" ");
            }
            System.out.println();
        }

    }
}

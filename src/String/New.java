package String;

public class New
{
    public static void main(String args[])
    {
        //Creating a string by String literal
        String str1 = "Soul";
        char arrc[] = {'f','u','l','l','o','f'};

        //Coverting char array arrc[] to string str2
        String str2 = new String(arrc);

        //Creating another String literal str3
        String str3 = new String("Sunshine");

        // Printing all the three strings
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}

package String;

public class Trimm
{
    public static void main (String[] args)
    {
        String s= "KnowYourWorth";
        // or String s= new String ("KnowYourWorth");

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());

        // Returns the character at ith index.
        System.out.println("Character at 5rd position = " + s.charAt(5));

        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(5));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));

        // Concatenates string2 to the end of string1.
        String s1 = "Know";
        String s2 = "yourWorth";
        System.out.println("Concatenated string  = " +s1.concat(s2));

        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Its okay not to be okay";
        System.out.println("Index of Share " + s4.indexOf("Share"));

        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + s4.indexOf('a',3));

        // Checking equality of Strings
        Boolean out = "Know".equals("know");
        System.out.println("Checking Equality  " + out);
        out = "Worth".equals("Worth");
        System.out.println("Checking Equality  " + out);

        out = "Your".equalsIgnoreCase("yoUr ");
        System.out.println("Checking Equality " + out);

        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "KnowME";
        System.out.println("Changing to lower Case " + word1.toLowerCase());

        // Converting cases
        String word2 = "KnowME";
        System.out.println("Changing to UPPER Case " + word2.toUpperCase());

        // Trimming the word
        String word4 = " Its okay not to be okay  ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "knowyouswosth";
        System.out.println("Original String " + str1);
        String str2 = "knowyouswosth".replace('s' ,'r') ;
        System.out.println("Replaced s with r -> " + str2);
    }
}



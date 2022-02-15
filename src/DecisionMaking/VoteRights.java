package DecisionMaking;

// DecisionMaking : The statements allow you to decide the order of execution of specific statements
                   // in your program

//if-else : It is used when you require to check two different conditions and execute a
// different set of code. It includes two blocks that are if block and else block.

public class VoteRights {

    static int age = 17;
    public static void main(String[] args)
    {
       if(age >= 18)
       {
          System.out.println("You have voting rights");
       }
       else
       {
           System.out.println("You are young for voting ");
           System.out.println("You can vote in "+(18 - age)+ " year");
       }
    }
}

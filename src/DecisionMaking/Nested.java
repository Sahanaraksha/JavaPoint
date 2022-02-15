package DecisionMaking;

//Nested if : Nested means within. It means an if statement inside an if statement.

public class Nested {
    public static void main(String args[]) {

        int age = 15;
        int marks = 75;
        float percentage = 85;

        if(age>15)
        {
            if(marks>=75)
            {
                if (percentage >= 85)
                {
                    System.out.println(" You can attend Board Exam");
                } else
                {
                    System.out.println("You can write exam and get good marks");
                }
            }
              else
                {
                   System.out.println("You wrote exam and got distinction");
                }
            }
        else
        {
            System.out.println("Age is not enough to attend Board Exam");
        }
    }
}
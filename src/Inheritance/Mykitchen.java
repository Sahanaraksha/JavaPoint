package Inheritance;
    // Hierarchical Inheritance : The multiple child classes inherit the single class or
    // the single class is inherited by multiple child class.

class Food{
    public void cook()
    {

        System.out.println("I am cooking");
    }
}
class Veg extends Food {
    public void dosa()
    {

        System.out.println("I am cooking Masala Dosa");
    }
}
class Nonveg extends Food{
    public void chicken()
    {

        System.out.println("I am cooking Chicken Tandoori");
    }
}

public class Mykitchen {
     public void kitchen()
     {
         System.out.println("This is My Kitchen");
     }

     public static void main(String args[]) {
         Food f = new Food();
         Veg v = new Veg();
         Nonveg n  = new Nonveg();
         f.cook();
         v.dosa();
         n.chicken();
     }
 }
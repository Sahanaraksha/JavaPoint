package Methods;
// Method Overriding : If a subclass (Child class) has the same method as in the parent class.

public class Overriding {
    public static void main(String  args[]){
        Restaurant r = new Restaurant();
        Restaurant t = new RRR();
        r.address();
        t.address();

    }

}
class Restaurant {
    public void address(){
        System.out.println("This is address of restaurant");

    }
}
class RRR extends Restaurant{
    public void address(){
        super.address();  // It invokes the super class method
        System.out.println("This is RRR address ");

    }
}

package Polymorphism;
       //  A single action in many forms or
       // Polymorphism means many forms.
class Bird{
    public void fly(){
        System.out.println("fly fly fly");
    }
}

class Parrot extends Bird{

}

public class Poly {
    public static void main(String args[]){
        Parrot b = new Parrot();
        b.fly();
    }

}

package Inheritance;
        // Multi-level Inheritance : A class is derived from a class which
        // is also derived from another class.

class Animal {
    void eat(){
        System.out.println("Animals will eat");
    }
}
class Tiger extends Animal{
    void hunt(){
        System.out.println("Tiger is Hunting");
    }
}
class BabyTiger extends Tiger{
    void sleep(){
        System.out.println("Baby Tiger is Sleeping");
    }
}
class TestMultilevel{
    public static void main(String args[]){
        BabyTiger T = new BabyTiger();
        T.sleep();
        T.hunt();
        T.eat();
    }
}

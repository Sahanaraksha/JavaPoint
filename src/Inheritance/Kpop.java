package Inheritance;

class Korean {
    public void print_BTS()
    {
        System.out.println("BTS");
    }
}

class Idol extends Korean {
    public void print_Forever() { System.out.println("Forever"); }
}

class Singers extends Idol {
    public void print_Army()
    {
        System.out.println("Army");
    }
}

// Drived class
public class Kpop {
    public static void main(String[] args)
    {
        Singers g = new Singers();
        g.print_BTS();
        g.print_Forever();
        g.print_Army();
    }
}












package Inheritance;
        // The process where one class acquires attributes and method of another class.

 class Employees {
    float salary = 50000;
}
class Developer extends Employees{
    int bonus = 10000;

    public static void main(String args[]){
        Developer dev = new Developer();
        System.out.println("Developer salary is :"+dev.salary);
        System.out.println("Developer salary is :"+dev.bonus);
    }
}

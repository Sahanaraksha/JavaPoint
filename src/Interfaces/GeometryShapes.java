package Interfaces;
// Interface : It is a blueprint of a class, it has static constant and abstract methods.
// It is used to achieve abstraction and Multiple Inheritance in Java.
// Abstraction : The process of hiding the implementation details and showing
// only functionality to the user
interface GeometryShapes {
    void getArea(int length, int width, int height);
}

// implementation of GeometryShapes interface
class Volume implements GeometryShapes{

    // implementation of abstract method
    public void getArea(int length, int width, int height){
        System.out.println("The area of the volume is " + (length * width * height));

    }

}
class Area{
    public static void main(String[] args) {
        Volume v1 = new Volume();
        v1.getArea(8,4,2);
    }


}

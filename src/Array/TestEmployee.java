package Array;

class Employee
{
    public int ID;
    public String name;
    public double salary;
    Employee(int ID, String name, double salary)
    {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
}

// Elements of the array are objects of a class Student.
public class TestEmployee
{
    public static void main(String[] args)
    {
        // declares an Array of integers.
        Employee[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Employee[5];

        // initialize the first elements of the array
        arr[0] = new Employee(111, "Aanan", 35000);

        // initialize the second elements of the array
        arr[1] = new Employee(112, "Diya", 30000);

        // so on...
        arr[2] = new Employee(113, "Krystal", 50000);
        arr[3] = new Employee(114, "Taniska", 55000);
        arr[4] = new Employee(115, "Yann", 45000);


        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " +
                    arr[i].ID + " " + arr[i].name + " " + arr[i].salary);
    }
}


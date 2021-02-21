package com.company;

class Employee13 {
    // Attributes declaration
    int id;
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void printDetails() {
        System.out.printf("My id is \"%d\" and my name is \"%s\" \n", id, name);
    }

    public int getSalary() {
        return salary;
    }
}

public class ch8_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee13 Aryan = new Employee13();  // Instantiating a new object of our custom class "Employee"
        Employee13 John = new Employee13();

        // Setting attributes for Aryan
        Aryan.id = 102;
        Aryan.name = "Code with Aryan";
        Aryan.salary = 34;

        // Setting attributes for Aryan
        John.id = 103;
        John.name = "John Tripathi";
        John.salary = 17;

        // Printing attributes
//        System.out.println(Aryan.id);
//        System.out.println(Aryan.name);

        // Using the methods of our custom class
//        Aryan.printDetails();
//        John.printDetails();

        System.out.println(Aryan.getId());
        System.out.println(Aryan.getName());
        System.out.println(Aryan.getSalary());
//        System.out.println(Aryan.getClass());

        System.out.println(John.getId());
        System.out.println(John.getName());
        System.out.println(John.getSalary());
    }
}

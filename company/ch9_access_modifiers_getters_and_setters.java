package com.company;

class MyEmployee {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

class myCircle {
    private int radius;

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setArea(float area) {
        float actualArea = getArea();
        if (area == actualArea) {
            System.out.println("CORRECT ANSWER!");
            System.out.println("Correct ans " + actualArea);
        } else {
            System.out.println("WRONG ANSWER!");
            System.out.println("The correct ans is " + actualArea);
        }
        System.out.println("Your ans " + area);
    }

    public float getArea() {
        return 2 * 3.14f * radius;
    }

}


public class ch9_access_modifiers_getters_and_setters {
    public static void main(String[] args) {
//        MyEmployee aryan = new MyEmployee();
//       aryan.id =99;
//       aryan.name ="Code With Aryan" ---> Throws an error because the attributes are private
        // access modifiers
        /*aryan.setId(9023);
        System.out.println(aryan.getId());
        aryan.setName("CodeWithAryan");
        System.out.println(aryan.getName());*/

        // Exercise
        myCircle c = new myCircle();
        c.setRadius(100);
        c.setArea(628);

    }
}


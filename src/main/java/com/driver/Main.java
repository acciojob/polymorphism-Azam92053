package com.driver;

public class Main {

    public static void main(String args[]){
        // Task 2: create object of Product in Main function called p
        Product p = new Product();

        // Task 3: call product(int, int)
        System.out.println(p.product(3, 4));

        // Task 4: call product(int, int, int)
        System.out.println(p.product(2, 3, 4));

        // Task 5: call product(double, double)
        System.out.println(p.product(3.00000, 9.00000));
    }

    static class Product{
    public int product(int x, int y) {
        return x*y;
    }

    public int product(int x, int y, int z){
        return x * y * z;
    }

    public double product(double x, double y) {
        return x * y;
    }
    }
}




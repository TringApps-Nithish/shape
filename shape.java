/*2. Design a class for a basic shape. The class should have the following features:
- An instance variable for the shape's type (e.g. triangle, rectangle, circle).
- An instance variable for the shape's dimensions (e.g. side lengths for a triangle, length and width for a rectangle, radius for a circle).
- A constructor that allows the user to create a shape with a given type and dimensions.
- A method that calculates and returns the perimeter of the shape.
- A method that calculates and returns the area of the shape.*/

import java.util.*;

class declaration {

    double triangle;
    double rectangle;
    double circle;
    double side1;
    double side2;
    double base;
    double length;
    double width;
    double radius;

    declaration(double side1, double side2, double base) {

        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }

    declaration(double length, double width) {
        this.length = length;
        this.width = width;
    }

    declaration(double radius) {
        this.radius = radius;
    }

    double area(double base, float height) {

        return 0.5 * base * height;

    }

    double perimeter(double side1, double side2, double base) {

        return side1 + side2 + base;

    }

    double area(double length, double width) {
        return length * width;

    }

    double perimeter(double length, double width) {

        return 2 * (length + width);

    }

    double area(double radius) {

        return radius * radius * 3.14;

    }

    double perimeter(double radius) {

        return 2 * 3.14 * radius;

    }

}

class shape {
    public static void main(String args[]) {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        while (ch != 4)

        {

            System.out.println("Enter your choice \n 1.Triangle \n 2.Rectangle \n 3.Circle \n 4.Exit ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("\n Enter the Base Value : ");
                    double base = sc.nextDouble();
                    System.out.println(" Enter the Lenth value : ");
                    float height = sc.nextFloat();
                    System.out.println("\n Enter side 1 and side 2: ");
                    System.out.println("\n Side1 : ");
                    double side1 = sc.nextDouble();
                    System.out.println("\n Side2 : ");
                    double side2 = sc.nextDouble();
                    declaration ob = new declaration(side1, side2, base);
                    System.out.println("Traingle created successfully ");
                    System.out.println("Area of Triangle: " + ob.area(base, height));
                    System.out.println("Perimeter of Triangle:" + ob.perimeter(side1, side2, base));
                }
                    break;

                case 2: {
                    System.out.println("\n Enter the Length Value : ");
                    double length = sc.nextDouble();
                    System.out.println(" Enter the Width Value : ");
                    double width = sc.nextDouble();
                    declaration ob = new declaration(length, width);
                    System.out.println("Rectangle created successfully ");
                    System.out.println("Area of Rectangle:" + ob.area(length, width));
                    System.out.println("Perimeter of Rectangle:" + ob.perimeter(length, width));
                }
                    break;

                case 3:

                {
                    System.out.println("\n Enter the Radius Value : ");
                    double radius = sc.nextDouble();
                    declaration ob = new declaration(radius);
                    System.out.println("Circle created successfully ");
                    System.out.println("Area of Circle:" + ob.area(radius));
                    System.out.println("Perimeter of Circle:" + ob.perimeter(radius));
                }
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n Invalid Choice");
                    break;
            }
        }
    }
}

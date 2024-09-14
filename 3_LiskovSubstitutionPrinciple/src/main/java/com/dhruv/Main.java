package com.dhruv;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,20);
        System.out.println(rectangle.computeArea());

        Square square=new Square(10);

        System.out.println(square.computeArea());

        useRectangle(rectangle);

//        useRectangle(square);


    }

    private static void useRectangle(Rectangle rectangle) {

        rectangle.setWidth(20);
        rectangle.setHeight(30);

        if(rectangle.getHeight()!=30)
            System.out.println("Height Not equal to 30");
        else
            System.out.println("Correct Arguments");

        if(rectangle.getWidth()!=20)
            System.out.println("Width Not equal to 20");
        else
            System.out.println("Correct Arguments");

    }
}

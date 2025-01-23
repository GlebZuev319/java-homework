package _17_12_2024;

import java.util.Random;

public class Task {
//создать класс Треугольник, написать какие у него будут поля
//создать класс Квадрат, написать какие у него будут поля
//создать класс Круг, написать какие у него будут поля

//ПРИДУМАТЬ ВЕРХНЕУРОВНЕВЫЙ КЛАСС,
//который будет содержать в себе ОБЩИЕ ДЛЯ ВСЕХ ФИГУР ПОЛЯ, если они есть
//ЕСЛИ ИХ НЕТ ТО ПРИДУМАТЬ ОБЩИЙ ДЛЯ ВСЕХ ПАРАМЕТР

//+ метод подсчета площади.

//Необходимо в каждом классе переопределить эти методы,
//что бы они правильно считали площадь фигур

//Создать класс Генератор, который
//будет содержать 3 метода на создание
//каждой фигуры С ВАЛИДНЫМИ ПАРАМЕТРАМИ.

    public static void main(String[] args) {
        class Figures {
            private String color;

            public Figures(String color) {
                this.color = color;
            }

            public String getColor() {
                return color;
            }
        }

        class Triangle extends Figures {
            private double side1;
            private double side2;
            private double side3;

            public Triangle(String color, double side1, double side2, double side3) {
                super(color);
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }

            public String getSides(){
                return side1+", "+side2+", "+side3;
            }

            public double getTriangleSquare(){
                double p = (side1+side2+side3)/2;
                return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
            }
        }

        class Square extends Figures {
            private double side;

            public Square(String color, double side) {
                super(color);
                this.side = side;
            }

            public double getSide(){
                return side;
            }

            public double getSquareSquare(){
                return side*side;
            }
        }

        class Circle extends Figures {
            private double radius;

            public Circle(String color, double radius) {
                super(color);
                this.radius = radius;
            }

            public double getRadius(){
                return radius;
            }

            public double getCircleSquare(){
                return (radius*radius*Math.PI);
            }
        }

        class Generator {
            private Random random = new Random();
            public Triangle genTriangle(String color) {
                int side1 = random.nextInt(10)+1;
                int side2 = random.nextInt(10)+1;
                int side3 = random.nextInt(10)+1;

                if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
                    return new Triangle(color, side1, side2, side3);
                } else {
                    System.out.println(side1+", "+side2+", "+side3+" – невалидные значения сторон треугольника");
                    return null;
                }
            }

            public Square genSquare(String color){
                int side = random.nextInt(10)+1;

                return new Square(color, side);
            }

            public Circle genCircle(String color){
                int radius = random.nextInt(10)+1;
                return new Circle(color, radius);
            }
        }

        Generator generator = new Generator();

        Triangle triangle = generator.genTriangle("red");
        Square square = generator.genSquare("green");
        Circle circle = generator.genCircle("blue");

        if (triangle!=null) {
            System.out.println("Цвет треугольника – " + triangle.getColor());
            System.out.println("Стороны треугольника – " + triangle.getSides());
            System.out.println("Площадь треугольника – " + triangle.getTriangleSquare());
        }

        System.out.println();

        System.out.println("Цвет квадрата – " + square.getColor());
        System.out.println("Сторона квадрата – " + square.getSide());
        System.out.println("Площадь квадрата – " + square.getSquareSquare());

        System.out.println();

        System.out.println("Цвет круга – " + circle.getColor());
        System.out.println("Радиус круга – " + circle.getRadius());
        System.out.println("Площадь круга – " + circle.getCircleSquare());
    }
}

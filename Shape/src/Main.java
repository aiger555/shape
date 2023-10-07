import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape: ");
            System.out.println("1 Rectangle");
            System.out.println("2 Circle");
            System.out.println("3 Triangle");
            System.out.println("4 Square");
            System.out.println("5 Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the rectangle: ");
                    String rectName = scanner.nextLine();
                    System.out.print("Enter the width of the rectangle: ");
                    double rectWidth = scanner.nextDouble();
                    System.out.print("Enter the height of the rectangle: ");
                    double rectHeight = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(rectName, rectWidth, rectHeight);
                    System.out.println("Area: " + rectangle.getArea());
                    System.out.println("Perimeter: " + rectangle.getPerimeter());
                    break;

                case 2:
                    System.out.print("Enter the name of the circle: ");
                    String circleName = scanner.nextLine();
                    System.out.print("Enter the radius of the circle: ");
                    double circleRadius = scanner.nextDouble();
                    Circle circle = new Circle(circleName, circleRadius);
                    System.out.println("Area: " + circle.getArea());
                    System.out.println("Perimeter: " + circle.getPerimeter());
                    break;

                case 3:
                    System.out.print("Enter the name of the triangle: ");
                    String triangleName = scanner.nextLine();
                    System.out.print("Enter the length of side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter the length of side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter the length of side 3: ");
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(triangleName, side1, side2, side3);
                    System.out.println("Area: " + triangle.getArea());
                    System.out.println("Perimeter: " + triangle.getPerimeter());
                    break;

                case 4:
                    System.out.print("Enter the name of the square: ");
                    String squareName = scanner.nextLine();
                    System.out.print("Enter the side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    Square square = new Square(squareName, sideLength);
                    System.out.println("Area: " + square.getArea());
                    System.out.println("Perimeter: " + square.getPerimeter());
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option !!!!");
            }
        }
    }
}
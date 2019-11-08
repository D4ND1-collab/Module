import java.util.Scanner;

public class Triangle {
    public static double main(double x1, double x2, double x3, double y1, double y2, double y3, double square) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 x coordinate: ");
        x1 = sc.nextDouble();
        System.out.print("Enter 2 x coordinate: ");
        x2 = sc.nextDouble();
        System.out.print("Enter 3 x coordinate: ");
        x3 = sc.nextDouble();
        System.out.println("Enter 1 y coordinate:");
        y1 = sc.nextDouble();
        System.out.println("Enter 2 y coordinate: ");
        y2 = sc.nextDouble();
        System.out.println("Enter 3 y coordinate: ");
        y3 = sc.nextDouble();
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        if (a + b <= c || a + c <= b || a + c <= b){
            System.out.println("Not existing ");
        square = 0;
    }
        else {
            double p = (a + b + c) / 2.0;
            square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Square: " + square);


        }
        return square;
    }
}


import java.util.Scanner;

abstract class Shape3D {
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Sphere Volume: " + volume);
    }

    void calculateSurfaceArea() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Sphere Surface Area: " + surfaceArea);
    }
}

class Cube extends Shape3D {
    double side;

    Cube(double side) {
        this.side = side;
    }

    void calculateVolume() {
        double volume = Math.pow(side, 3);
        System.out.println("Cube Volume: " + volume);
    }

    void calculateSurfaceArea() {
        double surfaceArea = 6 * Math.pow(side, 2);
        System.out.println("Cube Surface Area: " + surfaceArea);
    }
}

public class MainShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("S.Sohail, 24319, CSE-B");

        System.out.print("Enter radius of the sphere: ");
        double radius = scanner.nextDouble();
        Sphere sphere = new Sphere(radius);
        sphere.calculateVolume();
        sphere.calculateSurfaceArea();

        System.out.println();

        System.out.print("Enter side length of the cube: ");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        cube.calculateVolume();
        cube.calculateSurfaceArea();

        scanner.close();
    }
}

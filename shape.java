
import java.util.Scanner;

interface Shape{
    abstract int getPerimeter();
}

class Rectangle implements Shape{
    int length, breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public int getPerimeter(){
        return 2*(length + breadth);
    }
}

class Circle implements Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public int getPerimeter(){
        return (int) (2*3.14*radius);
    }
}

class Triangle implements Shape{
    int a, b, c;
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public int getPerimeter(){
        return a+b+c;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of Rectangle:");
        int length = scanner.nextInt();
        System.out.println("Enter breadth of Rectangle:");
        int breadth = scanner.nextInt();
        Rectangle r = new Rectangle(length, breadth);
        
        System.out.println("Enter radius of Circle:");
        int radius = scanner.nextInt();
        Circle c = new Circle(radius);
        
        System.out.println("Enter side a of Triangle:");
        int a = scanner.nextInt();
        System.out.println("Enter side b of Triangle:");
        int b = scanner.nextInt();
        System.out.println("Enter side c of Triangle:");
        int sideC = scanner.nextInt();
        Triangle t = new Triangle(a, b, sideC);
        
        System.out.println("Perimeter of Rectangle: " + r.getPerimeter());
        System.out.println("Perimeter of Circle: " + c.getPerimeter());
        System.out.println("Perimeter of Triangle: " + t.getPerimeter());
    }
}
import java.util.*;
public class Car{
    private String car_color;
    private String Brand;
    private String fuel_type;
    private String milage;
    Car(){
    }
    public void getCar(){
        System.out.println("car color: "+car_color+"\n"+"car Brand: "+Brand+" \n"+"fuel Type: "+fuel_type+" \n" +"Milage: "+milage);
    }
   public void start(){
    System.out.println("Car started");
   }
   public void stop(){
    System.out.println("Car stopped");
   }
   public static void main(String[]arga){
    Car c1=new Car();
    c1.car_color="Black";
    c1.Brand="Rolls Royce";
    c1.fuel_type="Petrol";
    c1.milage="10kmpl";
    c1.start();
    c1.getCar();
    c1.stop();
    System.out.println("\n");
    Car c2=new Car();
    c2.car_color="Red";
    c2.Brand="BMW";
    c2.fuel_type="Deisiel";
    c2.milage="14kmpl";
    c2.start();
    c2.getCar();
    c2.stop();
    System.out.println("\n");
    Car c3=new Car();
    c3.car_color="White";
    c3.Brand="Audi";
    c3.fuel_type="Petrol";
    c3.milage="12kmpl";
    c3.start();
    c3.getCar();
    c3.stop();
   }
}
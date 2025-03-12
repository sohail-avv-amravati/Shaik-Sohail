
class TeesukoRentals{
   
}
class Bikes extends TeesukoRentals{
    Bikes(){}
    public void vehicle(String Brand,String Model,int Speed){
        System.out.println("Brand : "+Brand);
        System.out.println("Model : "+Model);
        System.out.println("Speed : "+Speed);
    }
}
class Cars extends TeesukoRentals{
    Cars(){}
    public void vehicle(String Brand,String Model,int Speed,int Doors){
        System.out.println("Brand : "+Brand);
        System.out.println("Model : "+Model);
        System.out.println("Speed : "+Speed);
        System.out.println("Doors : "+Doors);
    }
}
class Truck extends TeesukoRentals{
    Truck(){}
    public void  vehicle(String Brand,String Model,int Speed,double  Load){
        System.out.println("Brand : "+Brand);
        System.out.println("Model : "+Model);
        System.out.println("Speed : "+Speed);
        System.out.println("Load : "+Load);
     }}
class TeesukoRentalsMain{
    public static void main(String[] args) {
        Bikes bike=new Bikes();
        bike.vehicle("Yamaha","FZ",120);
        Bikes bike1=new Bikes();
        bike1.vehicle("Hero Honda", "CD Dulex" , 100);
        Bikes bike2=new Bikes();
        bike2.vehicle("Royal Enfield","GT650",165);
        Cars car=new Cars();
        car.vehicle("Hyundai","Verna",180,4);
        Cars car1=new Cars();
        car1.vehicle("Rolls Royce","Ghost",245,4);

        Truck truck=new Truck();
        truck.vehicle("Bharathbenz", "1923c", 60, 18.5);
    }
}
abstract class Animal{
    abstract void sound(); // Abstract method

}
class Tiger extends Animal{
    void sound(){ // Implementation abstract method named sound
        System.out.println("Roar");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Roar");
    } 
    }
class liontiger{
    public static void main(String[] args) {
        Tiger tiger1=new Tiger();
        tiger1.sound();
        System.out.println("\n");
        Lion lion1=new Lion();
        lion1.sound();
    }
}
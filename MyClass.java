class MyClass{
    static int count=0;
    double Pi=3.14159;
    public MyClass(){
        count++;

    }
    void dispaly(){
        System.out.println("Count: "+count);
        System.out.println("Pi: "+Pi);
    }
}
class Moin{
    public static void main(String args[]){
        MyClass obj1=new MyClass();
        obj1.dispaly();
        MyClass obj2=new MyClass();
        obj2.dispaly();
    }
}
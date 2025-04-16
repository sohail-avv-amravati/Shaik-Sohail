interface Playable{
    public void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Playing football");
    }
}
class volleyball implements Playable{
    public void play(){
        System.out.println("Playing volleyball");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Playing basketball");
    }
}
class Main{
    public static void main(String[] args) {
        Playable p1=new Football();
        volleyball p2=new volleyball();
        Basketball p3=new Basketball();
        p1.play();
        p2.play();
        p3.play();

    }
}
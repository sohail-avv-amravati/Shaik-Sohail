class book{
    String title,author;
    int year_of_publication;

 public book(){
    title="";
    author="";     
    year_of_publication=0;
}
void display(){
    System.out.println(("Title: "+title+"\nAuthor: "+author+"\nYear of Publication: "+year_of_publication));
}
}
class Main{
    public static void main(String[]args){
        book b1=new book();
        b1.title="the java programming language";
        b1.author="james gosling";
        b1.year_of_publication=1996;
        b1.display();
        System.out.println("\n");
        book b2=new book(); 
        b2.title="the art of computer";
        b2.author="Donald Knuth";
        b2.year_of_publication=1997;    
        b2.display();
    }
}

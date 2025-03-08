
import java.util.*;
public class Book{
    private String Title;
    private String  Author;
    private String Year_of_publicition;
    Book(){
    }
    public void getBook(){
        System.out.println("Title: "+Title+"\n"+"Author: "+Author+" \n"+"Year of publicition: "+Year_of_publicition);
    }
   public static void main(String[]arga){
    Book B1=new Book();
    B1.Title="Missile Man of India";
    B1.Author="APJ ABDUL KALAM";
    B1.Year_of_publicition="2015";
    B1.getBook();
    System.out.println("\n");
    Book B2=new Book(); 
    B2.Title="Harry poter";
    B2.Author="J.K.Rowling";
    B2.Year_of_publicition="2001";
    B2.getBook();
   }
}

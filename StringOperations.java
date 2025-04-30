//Design and implement a java program that will do following operationsto the string"Welcome! Youy are practicing Strings concepts" CONVERT TO ALL CAPTIALS,CONVERT ALL TOLOWER,LENGTH,INDEX OF COURE
import java.lang.String;
class StringOperation{
    public static void main(String [] args){
        String string="Welcome! You are practicing Strings concepts";
        Systrm.out.println("orginal String is "+string);
        //strring to upper case
        String upper=string.toUpperCase();
        System.out.println("String in upper case is "+upper);
        //string to lower case
        String lower=string.toLowerCase();
        System.out.println("String in lower case is "+lower);
        //length of a string
        int length=string.length();
        System.out.println("Length of string is "+length);
        //index of a course
        int index=string.indexOf("course");
        System.out.println("Index of course is "+index);

    }
}
// Write a Java program to generate a password using his or her initials and age. The password contains the first letter of the first name, second name, last name, and age.
import java.util.Scanner;
class PaswordMaker{
    public static void main(String []args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Enter your first name:");
            String firstName = scn.nextLine();    
            System.out.print("Enter your second name:");
            String secondName = scn.nextLine();
            System.out.print("Enter your last name:");
            String lastName = scn.nextLine();
            System.out.print("Enter your age:");
            int age = scn.nextInt();
            String password = "" + firstName.charAt(0) + secondName.charAt(0) + lastName.charAt(0) + age;
            String Password= password.toUpperCase();
            System.out.println("Your password is:" + Password);
        }

    }
}
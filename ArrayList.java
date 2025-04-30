import java.util.ArrayList;
import java.util.List; 
class CustomArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Draagon fruit");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);   
        //insert an element at perticular index
        list.add(2, "Mango");
        System.out.println("ArrayList after inserting Mango at index 2: " + list);  
        //Modefy an element at perticular index
        list.set(1, "Blueberry");
        System.out.println("ArrayList after modifying index 1 to Blueberry: " + list);
        //Remove an element from the ArrayList
        list.remove("Banana");
        System.out.println("ArrayList after removing Banana: " + list);
        //clear the elements from array list
        list.clear();
        System.out.println("ArrayList after clearing all elements: " + list);


        // 
    }}
import java.util.ArrayList;


public class GenericLists {

    static ArrayList myList = new ArrayList<>();
    public static void main(String[] args) {
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i=0;i<myList.size();i++){
            try{
                int castedValue = (Integer) myList.get(i);
            }
            catch(ClassCastException e){
                System.out.println("Caught exception: "+myList.get(i));
            }
        }
    }
    // Create a generic array list with strings and integers
    // Looping through the array list, it tries to assign each
    // item to an integer object
    // If the item is not an integer, it will catch the exception
    // and print that it is an exception along with what the exception was

}

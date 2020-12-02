import java.util.ArrayList;
import java.io.*;
import java.lang.*;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(13);
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        Errors error = new Errors();
        try{
            error.run(myList);
            System.out.println("Success!");
        } catch (Except e) {
            System.out.println("Errors!");
            for(int i = 0; i < myList.size(); i++) {
                if (myList.get(i) instanceof Number) {
                    ;
                }
                else {
                    System.out.println("The following object: " + myList.get(i) + ", at index [" + i + "] is not an instance of an Integer!");
                }
            }
        }
    }
}
class Except extends Exception{
    private static final long serialVersionUID = 1L;
}

class Errors {
    public boolean run(ArrayList<Object> arr) throws Except {
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof String) {
                throw new Except();
            }
        }
        return true;
    }
}
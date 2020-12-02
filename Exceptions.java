import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
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
                
            }
        }
    }
}
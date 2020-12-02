import java.util.ArrayList;

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


class Except extends Exceptions{}

class Errors {
    public boolean run(ArrayList<Object> arr) throws Except {
        for(int i = 0; i < arr.size(); i++) {
            Integer castedValue = (Integer) arr.get(i);
        }
    }
}
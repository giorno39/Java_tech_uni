public class EmptyArrayException extends Exception{
    @Override
    public String getMessage() {
        return "The array of houses is empty";
    }
}

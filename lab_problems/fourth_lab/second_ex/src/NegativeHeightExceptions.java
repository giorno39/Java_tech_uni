public class NegativeHeightExceptions extends Exception{
    @Override
    public String getMessage() {
        return "Height can't be a negative number";
    }
}

public class NegativeSurface extends Exception{
    @Override
    public String getMessage() {
        return "Surface cant be a negative number";
    }
}

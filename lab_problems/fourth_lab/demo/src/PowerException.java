public class PowerException extends Exception{
    @Override
    public String getMessage() {
        return "Power is not sufficient";
    }
}

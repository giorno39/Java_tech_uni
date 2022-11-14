public class WrongPhoneNumber extends Exception{
    @Override
    public String getMessage() {
        return "Phone number is invalid";
    }
}

public class WrongPhoneNumberException extends Exception{
    @Override
    public String getMessage() {
        return "The phone number is wrong!";
    }
}

public class WrongUserException extends Exception{
    @Override
    public String getMessage() {
        return "User is wrong";
    }
}

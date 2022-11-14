import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {

    public static Boolean validateUsername(String value) throws WrongUserException {
        Boolean IsValid = false;
        Pattern pattern = Pattern.compile("^[a-z0-9_\\-]+");
        Matcher matcher = pattern.matcher("value");
        if(matcher.find()){
            IsValid = true;
        }

        if(value.length() < 3  || value.length() > 15){
            IsValid = false;
        }
        if(!IsValid){
            throw new WrongUserException();
        }
        return IsValid;
    }

    public static Boolean validatePassword(String value) throws WrongUserException {
        Boolean IsValid = false;
        Pattern pattern = Pattern.compile("^[a-z0-9_\\-]+");
        Matcher matcher = pattern.matcher("value");
        if(matcher.find()){
            IsValid = true;
        }

        if(value.length() < 11){
            IsValid = false;
        }
        if(!IsValid){
            throw new WrongUserException();
        }
        return IsValid;
    }

    public static User checkUser(User user, User[] users) {
        for (User profile : users) {
            if (profile.getUsername().equals(user.getUsername())) {
                return profile;
            }
        }
        return null;
    }


}

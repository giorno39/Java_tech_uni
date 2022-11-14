import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface ValidatePhone {
    public static Boolean validatePhoneNumber(String number) throws WrongPhoneNumber {
        Boolean IsValid = false;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("value");
        if(matcher.find()){
            IsValid = true;
        }
        if(!IsValid){
            throw new WrongPhoneNumber();
        }
        return IsValid;
    }
}

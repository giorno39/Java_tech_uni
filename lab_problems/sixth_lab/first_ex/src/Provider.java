import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Provider implements ValidatePhone{
    String phoneNumber;
    String name;

    public Provider(String phoneNumber, String name) throws WrongPhoneNumberException {
        this.name = name;
        this.phoneNumber = setPhoneNumber(phoneNumber);
    }

    public String setPhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        checkPhone(phoneNumber);
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }

    @Override
    public boolean checkPhone(String phoneNumber) throws WrongPhoneNumberException {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("value");
        if(matcher.find()){
            return true;
        }else{
            throw new WrongPhoneNumberException();
        }
    }
}

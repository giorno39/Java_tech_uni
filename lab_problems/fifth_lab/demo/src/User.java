

public class User implements  ValidatePhone{
    private String username;
    private String password;
    private String number;

    public User(String username, String password, String number){
        this.username = username;
        this.password = password;
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        Boolean IsValid = false;
        try{
            IsValid = Validators.validateUsername(username);
        }catch (WrongUserException e){
            System.err.println(e.getMessage());
        }

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws WrongUserException {
        Boolean IsValid = false;
        try{
            IsValid = Validators.validatePassword(password);
        }catch (WrongUserException e){
            System.err.println(e.getMessage());
        }
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) throws WrongPhoneNumber {
        Boolean IsValid = false;
        try{
            IsValid = ValidatePhone.validatePhoneNumber(number);
        }catch (WrongPhoneNumber e){
            System.err.println(e.getMessage());
        }
        this.number = number;
    }
}

public class People {
    private String first_name;
    private String second_name;
    private String date_of_birth;

//    public People(){
//        this.first_name = "";
//        this.second_name = "";
//        this.date_of_birth = "";
//    }

    public People(String f, String s, String date){
        this.first_name = f;
        this.second_name = s;
        this.date_of_birth = date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}

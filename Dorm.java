public class Dorm {
    private int number;
    private String name;
    private String gender;
    public Dorm(int n,String na,String g){
        number=n;
        name=na;
        gender=g;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int n) {
        number = n;
    }
    public String getName() {
        return name;
    }
    public void setName(String na) {
        name = na;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String g) {
        gender = g;
    }
}

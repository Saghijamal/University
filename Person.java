public class Person {
    private String side;
    private String name;
    private String lastname;
    public Person(String s,String n,String ln){
        side=s;
        name=n;
        lastname=ln;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String s) {
        side = s;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String ln) {
        lastname = ln;
    }
}

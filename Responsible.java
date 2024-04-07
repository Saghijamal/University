public class Responsible {
    private String side;
    private int code;
    private String name;
    private int age;
    public Responsible(String s,int c,String n,int a){
        side=s;
        code=c;
        name=n;
        age=a;
    }
    public String getSide() {
        return side;
    }
    public void setSide(String s) {
        side = s;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int c) {
        code = c;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
}

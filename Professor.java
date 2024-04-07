public class Professor {
    private int number;
    private String name;
    private String field;
    private String college;
    public Professor(int n,String na,String f,String c){
        number=n;
        name=na;
        field=f;
        college=c;
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
    public String getField() {
        return field;
    }
    public void setField(String f) {
        field = f;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String c) {
        college = c;
    }
    public double hoghoogh(int n){
        double h=n*30_000_000;
        return h;
    }
}

public class Office {
    private int number;
    private String college;
    private String field;
    public Office(int n,String c,String f){
        number=n;
        college=c;
        field=f;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int n) {
        number = n;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String c) {
        college = c;
    }
    public String getField() {
        return field;
    }
    public void setField(String f) {
        field = f;
    }
}

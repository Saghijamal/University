public class Laboratory {
    private int numdevice;
    private String name;
    private String field;
    public Laboratory(int nd,String n,String f){
        numdevice=nd;
        name=n;
        field=f;
    }
    public int getNumdevice() {
        return numdevice;
    }
    public void setNumdevice(int nd) {
        numdevice = nd;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public String getField() {
        return field;
    }
    public void setField(String f) {
        field = f;
    }
}

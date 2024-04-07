public class Site {
    private int numdevice;
    private String name;
    private String college;
    public Site(int nd,String n,String c){
        numdevice=nd;
        name=n;
        college=c;
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
    public String getCollege() {
        return college;
    }
    public void setCollege(String c) {
        college = c;
    }
}

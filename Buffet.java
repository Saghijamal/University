public class Buffet {
    private int numproduct;
    private String name;
    private String location;
    public Buffet(int np,String n,String l){
        numproduct=np;
        name=n;
        location=l;
    }
    public int getNumproduct() {
        return numproduct;
    }
    public void setNumproduct(int np) {
        numproduct = np;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String l) {
        location = l;
    }
    public void print(){
        System.out.println("hours of work:"+"7a.m - 6p.m");
    }
}

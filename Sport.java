public class Sport {
    private String location;
    private String name;
    private int number;
    private String namecoach;
    public Sport(String l,String na,int n,String nc){
        location=l;
        name=na;
        number=n;
        namecoach=nc;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String l){
        location=l;
    }
    public String getName() {
        return name;
    }
    public void setName(String na) {
        name = na;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int n) {
        number = n;
    }
    public String getNamecoach() {
        return namecoach;
    }
    public void setNamecoach(String nc) {
        namecoach = nc;
    }
    public void print(){
        System.out.println("hours of work:"+"8a.m - 6p.m");
    }
}

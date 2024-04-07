public class Self {
    private String location;
    private String gender;
    private int capacity;
    private int numfood;
    public Self(String l,String g,int c,int nf){
        location=l;
        gender=g;
        capacity=c;
        numfood=nf;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String l) {
        location = l;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String g) {
        gender = g;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int c) {
        capacity = c;
    }
    public int getNumfood() {
        return numfood;
    }
    public void setNumfood(int nf) {
        numfood = nf;
    }
}

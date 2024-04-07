public class University {
    private String name;
    private double area;
    private int numstu;
    private String founder;
    public University(String n,double a,int ns,String f){
        name=n;
        area=a;
        numstu=ns;
        founder=f;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double a){
        area=a;
    }
    public int getNumstu(){
        return numstu;
    }
    public void setNumstu(int ns){
        numstu=ns;
    }
    public String getFounder(){
        return founder;
    }
    public void setFounder(String f){
        founder=f;
    }
    public void cast(double ns) {
        double cast=ns*200;
        System.out.println("Cost of students in one day:"+cast);
    }
}

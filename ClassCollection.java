public class ClassCollection {
    private String namecoll;
    private int numclass;
    private int smartboard;
    private int vacant;
    //smartboard=tedad class haei ke takhteh hooshmand darand
    //vacant=tedad class haye khali
    public ClassCollection(String nc,int nclass,int sb,int v){
        namecoll=nc;
        numclass=nclass;
        smartboard=sb;
        vacant=v;
    }
    public String getNamecoll() {
        return namecoll;
    }
    public void setNamecoll(String nc) {
        namecoll = nc;
    }
    public int getNumclass() {
        return numclass;
    }
    public void setNumclass(int nclass) {
        numclass = nclass;
    }
    public int getSmartboard() {
        return smartboard;
    }
    public void setSmartboard(int sb) {
        smartboard = sb;
    }
    public int getVacant() {
        return vacant;
    }
    public void setVacant(int v) {
        vacant = v;
    }
    public void full(int v){
        //tedad class hay full
        int f=numclass-v;
        System.out.println("Number of full classes:"+f);
    }
}

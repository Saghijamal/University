public class Library {
    private int numbook;
    private String name;
    private int numfloors;
    public Library(int nb,String n,int nf){
        numbook=nb;
        name=n;
        numfloors=nf;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getNumbook(){
        return numbook;
    }
    public void setNumbook(int nb){
        numbook=nb;
    }
    public int getNumfloors(){
        return numfloors;
    }
    public void setNumfloors(int nf){
        numfloors=nf;
    }
}

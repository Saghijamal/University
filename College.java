public class College {
    private String name;
    private String manager;
    private int numstu;
    private int numfields;
    public College(String n,String m,int ns,int nf){
        name=n;
        manager=m;
        numstu=ns;
        numfields=nf;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){ name=n; }
    public String getManager(){
        return manager;
    }
    public void setManager(String m){
        manager=m;
    }
    public int getNumstu(){
        return numstu;
    }
    public void setNumstu(int ns){
        numstu=ns;
    }
    public int getNumfields(){
        return numfields;
    }
    public void setNumfields(int nf){
        numfields=nf;
    }
    public void numSupervisor(int ns){
        //har 20 daneshjoo yek ostad rahnama darand
        int numSupervisor=ns/20;
        System.out.println("number of Supervisor:"+numSupervisor);
    }
}

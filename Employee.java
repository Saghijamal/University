public class Employee {
    private String name;
    private int age;
    private int sabegheh;
    public Employee(String n,int a,int s){
        name=n;
        age=a;
        sabegheh=s;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
    public int getSabegheh() {
        return sabegheh;
    }
    public void setSabegheh(int s) {
        sabegheh = s;
    }
    public double print(int n){
        double hoghoogh=n*10_000_000;
        return hoghoogh;
    }
}

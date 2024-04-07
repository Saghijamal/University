public class Student {
    private String name;
    private int shomareh;
    private String section;
    private String field;
    public Student(String n,int sh,String s,String f){
        name=n;
        shomareh=sh;
        section=s;
        field=f;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getShomareh() {
        return shomareh;
    }
    public void setShomareh(int sh) {
        shomareh = sh;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String s) {
        section = s;
    }
    public String getField() {
        return field;
    }

    public void setField(String f) {
        field = f;
    }
}


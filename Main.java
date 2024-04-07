public class Main {
    public static void main(String[] args) {
        University uni=new University("kashan",530,8000,"dreslami");
        System.out.println("name:"+uni.getName());
        System.out.println("area:"+uni.getArea());
        System.out.println("number of student:"+uni.getNumstu());
        System.out.println("founder:"+uni.getFounder());
        uni.cast(8000);
        System.out.println();

        College coll=new College("oloom payeh","drjahanipoor",900,9);
        System.out.println("name:"+coll.getName());
        System.out.println("manager:"+coll.getManager());
        System.out.println("number of student:"+coll.getNumstu());
        System.out.println("number of fields:"+coll.getNumfields());
        coll.numSupervisor(900);
        System.out.println();

        ClassCollection cc=new ClassCollection("oloom payeh",8,6,4);
        System.out.println("name of college:"+cc.getNamecoll());
        System.out.println("number of class:"+cc.getNumclass());
        System.out.println("number of smart board:"+cc.getSmartboard());
        System.out.println("number of empty classes:"+cc.getVacant());
        cc.full(4);
        System.out.println();

        Library lib=new Library(200,"markazi",3);
        System.out.println("number of book:"+lib.getNumbook());
        System.out.println("name:"+lib.getName());
        System.out.println("number of floors:"+lib.getNumfloors());
        System.out.println();

        Self self=new Self("north","female",100,10);
        System.out.println("location:"+self.getLocation());
        System.out.println("gender:"+self.getGender());
        System.out.println("capacity:"+self.getCapacity());
        System.out.println("number of food:"+self.getNumfood());
        System.out.println();

        Buffet buffet=new Buffet(40,"javan","south");
        System.out.println("number of product:"+buffet.getNumproduct());
        System.out.println("name:"+buffet.getName());
        System.out.println("location:"+buffet.getLocation());
        buffet.print();
        System.out.println();

        Laboratory lab=new Laboratory(100,"computer science","computer science");
        System.out.println("number of device:"+lab.getNumdevice());
        System.out.println("name:"+lab.getName());
        System.out.println("field:"+lab.getField());
        System.out.println();

        Site site=new Site(30,"math","oloom payeh");
        System.out.println("number of device:"+site.getNumdevice());
        System.out.println("name:"+site.getName());
        System.out.println("college:"+site.getCollege());
        System.out.println();

        Office ostad=new Office(10,"oloom payeh","computer science");
        System.out.println("number:"+ostad.getNumber());
        System.out.println("college:"+ostad.getCollege());
        System.out.println("field:"+ostad.getField());
        System.out.println();

        Dorm dorm=new Dorm(4,"markazi","male");
        System.out.println("number of dorm:"+dorm.getNumber());
        System.out.println("name:"+dorm.getName());
        System.out.println("gender:"+dorm.getGender());
        System.out.println();

        Sport sport=new Sport("north","saloon sepideh",3,"asma afshar");
        System.out.println("location:"+sport.getLocation());
        System.out.println("name:"+sport.getName());
        System.out.println("number:"+sport.getNumber());
        System.out.println("namecoach:"+sport.getNamecoach());
        sport.print();
        System.out.println();

        Person person=new Person("student","saghi sadat","jamal");
        System.out.println("person's side:"+person.getSide());
        System.out.println("name:"+person.getName());
        System.out.println("last name:"+person.getLastname());
        System.out.println();

        Professor pro=new Professor(120,"dr.shamaei","computer science","oloom payeh");
        System.out.println("number:"+pro.getNumber());
        System.out.println("name:"+pro.getName());
        System.out.println("field:"+pro.getField());
        System.out.println("college:"+pro.getCollege());
        System.out.println("hoghoogh kol:"+pro.hoghoogh(120));
        System.out.println();

        Responsible res=new Responsible("Chairman",12345,"dr.ketabi",48);
        System.out.println("side:"+res.getSide());
        System.out.println("code:"+res.getCode());
        System.out.println("name:"+res.getName());
        System.out.println("age:"+res.getAge());
        System.out.println();

        Student stu=new Student("saghi sadat",50005,"bachelor","computer science");
        System.out.println("name:"+stu.getName());
        System.out.println("shomareh daneshjoei:"+stu.getShomareh());
        System.out.println("section:"+stu.getSection());
        System.out.println("field:"+stu.getField());
        System.out.println();

        Employee emp=new Employee("mr.mohammadi",43,20);
        System.out.println("name:"+emp.getName());
        System.out.println("age:"+emp.getAge());
        System.out.println("sabegheh:"+emp.getSabegheh());
        System.out.println("hoghoogh kol:"+emp.print(100));
    }
}
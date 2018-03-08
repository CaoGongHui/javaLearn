public class StaticDemo {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="小强";
        p.show();
    }
}
class Person{
    String name;
    static String country="cn";
    public void show(){
        System.out.println(country+":"+name);
    }
}

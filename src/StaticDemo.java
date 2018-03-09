public class StaticDemo {
    int num =4;

    public static void main(String[] args) {
        Person p=new Person();
        p.name="小强";
        p.show();
        new StaticDemo().show();
    }
    public  void show(){
        System.out.println(num);
    }

}
class Person{
    String name;//成员变量（实例变量）
    static String country="cn";//静态变量，类变量
    public void show(){
        System.out.println(country+":"+name);
    }
}

public class ExtendsDemo {
    public static void main(String[] args) {

    }
}
class Student extends  Person{
 //   String name;
//    int age;
    void study(){
        System.out.println(name+"...student study.."+age);
    }
}
class Worker extends Person{
//    String name;
  //  int age;
    void work(){
        System.out.println("worker work");
    }
}
class Person{
    String name;
    int age;
}

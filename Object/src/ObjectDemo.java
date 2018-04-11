
public class ObjectDemo {
    public static void main(String[] args) {
        Person p1=new Person(20);
        Person p2=new Person(20);
        System.out.println(p1);
        System.out.println();
     //   System.out.println(p1==p2);
       // System.out.println(p1.equals(p2));
        //System.out.println(p1);
        //System.out.println(Integer.toHexString(p1.hashCode()));
        //Class clazz1=p1.getClass();
        //Class clazz2=p2.getClass();
        //System.out.println(clazz1.equals(clazz2));
    }
}
class Person{
    private int age;
    Person(int age){
        this.age=age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            throw new ClassCastException("the type is error");
        }
        Person p=(Person)obj;
        return this.age==p.age;
    }
   /* public int hashCode(){
        return age;
    }*/
}

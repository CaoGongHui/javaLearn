class Person{
    private int age;
    private String name;
    Person(){
        name="baby";
        age=1;
        System.out.println("person run");
    }

    Person(String name) {
        this.name = name;

    }
    Person(int age){
        this.age=age;
    }
    Person(String name,int age){
        this(name);
        this.age=age;
        
    }
    public void speak(){
        System.out.println(name+":"+age);
    }
    public boolean compare(Person p){
        if (this.age==p.age)
            return true;
        else
            return  false;
    }


}
class ThisDemo{
    public static void main(String[] args) {
        Person p1=new Person("aa",23);
        Person p2=new Person("vv",34);
        p1.compare(p2);
 /*       Person p=new Person("Xiao Qiang",30);
        p.speak();
        Person p1=new Person("Wang cai");
        p1.speak();
        Person newPerson2 = new Person();*/
    }
}
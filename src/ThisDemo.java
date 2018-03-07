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


}
class ThisDemo{
    public static void main(String[] args) {
        Person p=new Person("Xiao Qiang",30);
        p.speak();
        Person p1=new Person("Wang cai");
        p1.speak();
        Person newPerson = new Person();
    }
}
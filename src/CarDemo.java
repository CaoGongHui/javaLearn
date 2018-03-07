class Car{
    int num=10;
    String color;
    void run(){
        System.out.println(num+"..."+color);
    }
}
public class CarDemo{
    public static void main(String[] args) {
        /*Car c= new Car();//c就是一个类类型的引用变量，指向了该类的对象
        Car c1=c;
        c.num=4;
        c1.color="blue";
        //c.color="red";
        c=null;
        c1.run();*/
        /*Car c1=new Car();
        c1.num=4;
        c1.color="blue";
        
        Car c2=new Car();
        c2.color="red";
        c2.num=4;*/
        Car c1=new Car();
        Car c2=new Car();
        show(c1);
        show(c2);

    }
    public static void show(Car c){//类类型的变量一定指向对象，否则为null
        c.num=3;
        c.color="black";

    }
}
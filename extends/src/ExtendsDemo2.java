public class ExtendsDemo2 {
    public static void main(String[] args) {
        //Zi z=new Zi();
        //z.show();
        NewPhone p=new NewPhone();
        p.show();
    }
}
class Fu{
    int num=4;
}
class Zi extends Fu{
    int num=5;
    void show(){
        System.out.println(num+"...."+super.num);
    }
}
class Phone{
    void show(){
        System.out.println("pic");
    }
    void call(){

    }
}
class NewPhone extends Phone{
    void show(){

        System.out.println("name");
        System.out.println("number");
        super.show();
    }
}
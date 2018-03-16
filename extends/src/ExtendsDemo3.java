/**
 * 当子类构造对象时 发现父类的构造函数也被调用了
 * 因为子类的构造函数中有个隐式的函数 ：super（）；
 *
 * 子类的实例化过程：子类中的所有构造函数默认访问父类中的空参数的构造函数
 *
 * 为什么呢？
 *
 */
public class ExtendsDemo3 {
    public static void main(String[] args) {
        new Zi1();
    }
}
class Fu1{
    Fu1(){
        System.out.println("fu run");
    }
}
class Zi1 extends Fu1{
    Zi1(){
        //super();//调用的就是父类中空参数的构造函数
        System.out.println("zi run");
    }
}

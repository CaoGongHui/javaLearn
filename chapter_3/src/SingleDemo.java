class Test{
    private int num;
    private static Test t=new Test();
    private Test(){}
    public static Test getT(){
        return t;

    }
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }

}
public class SingleDemo{
    public static void main(String[] args) {
        Test t1=Test.getT();
        Test t2=Test.getT();
        t1.setNum(19);
        t2.setNum(24);
        System.out.println(t1.getNum());
        System.out.println(t2.getNum());
    }
}

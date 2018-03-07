/*获取一个整数的16进制

 */
public class ArrayTest2 {
    public static void main(String[] args) {
    //    toHex(60);
       // toHex_01(60);
        toHex(60);
        toBinary(60);
        toOctal(60);
    }
    public static void toHex(int num){
        trans(num ,15,4);
    }
    public static void toBinary(int num){
        trans(num ,1,1);
    }
    public static void toOctal(int num){
        trans(num ,7,3);
    }
    public static void  trans(int num,int base,int offset){
        if (num==0){
            System.out.println("0");
            return;
        }
        char [] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char [] arr=new char[8];
        int pos =arr.length;
        while (num!=0) {
            int temp = num & base;
            arr[--pos] = chs[temp];
            num = num >>> offset;
        }
        for (int i = pos; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    /*public static void toHex_01(int num){
        char [] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        for (int i = 0; i <8 ; i++) {
            int temp= num&15;
            System.out.print(chs[temp]);
            num=num>>>4;

        }

    }
    public static void toHex(int num){
        for (int i = 0; i <8 ; i++) {
            int temp = num&15;
            if (temp>9)
                System.out.println((char) (temp-10+'A'));
            else
                System.out.println(temp);
            num=num >>>4;
        }
     /*   int n1 = num & 15;
        System.out.println("n1="+n1);
        num=num>>>4;
        int n2 = num&15;
        System.out.println("n2="+n2);
    }*/
}

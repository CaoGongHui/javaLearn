public class ReverseNum {
    public static int reversenum(int x){
        String y = null;
        if(x>=0) {
            y=Integer.toString(x);
            long a =Long.parseLong(new StringBuilder(y).reverse().toString());
            if (a<=Integer.MAX_VALUE)
                return (int)a;
            else return 0;
        }
        else{
            long b=Math.abs((long)x);
            y=Long.toString(b);
            long a =Long.parseLong(new StringBuilder(y).reverse().toString());
            a=-a;
            if (a>=Integer.MIN_VALUE)
                return (int)a;
            else return 0;
        }
    }

    public static void main(String[] args) {
        int x=-2147483648;
        System.out.println(reversenum(x));
    }
}

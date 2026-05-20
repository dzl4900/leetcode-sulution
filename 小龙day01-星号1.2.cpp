public class one {
    public static void main(String[] args){
        int a=3;
        fun(a);
        System.out.println(a);
    }
    public static void fun(int a){
        a+=2;
        System.out.println(a);

    }
}
根据题中意思，光标停在fun(a)这一行，逐步执行，跳转到a+=2这行，因此选D
package KolokwiumInternetowe2023L.Zad2;

public class Main {
    public static void main(String[] args) {
        System.out.println(fun((byte) 3));
        System.out.println(fun( 0.5f));
        System.out.println(fun( 'a'));
        System.out.println(fun( 0.2d));
    }

    public static String fun(int val){
        return "s";
    }
    public static String fun(long val){
        return "l";
    }
    public static String fun(short val){
        return "f";
    }
    public static String fun(double val){
        return "d";
    }

}

package KolokwiumInternetowe2023L.Zad1;

public class Main {
    public static void main(String[] args) {
        System.out.println(operation(0xA, 03));
    }

    public static int operation(int a, int b){
        int result = 0;
        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;
        a = a >> 31 == 0 ? a : (~a + 1);
        b = b >> 31 == 0 ? b : (~b + 1);
        int x = 0;
        for(int i = 31; i >= 0; i--){
            if((a >>> i) >= b){
                result += 1 << i;
                a -= b << i;
            }
        }
        return sign * result;
    }
}

package KolokwiumInternetowe2023L.Zad6;

public class Main {
    public static void main(String[] args)  {
        Temperature temperature = new Temperature(12.5, 120.3,53.4);
        temperature.get('F');
        temperature.validate(22.4, 180.3, 112.4);
    }
}

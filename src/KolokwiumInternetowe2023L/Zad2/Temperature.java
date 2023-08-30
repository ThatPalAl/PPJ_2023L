package KolokwiumInternetowe2023L.Zad2;

import java.util.InputMismatchException;

public class Temperature {

    private final double[] temperatures;

    public Temperature(double celsiusTemp, double fahrenheitTemp, double kelvinTemp) {
        temperatures = new double[3];
        temperatures[0] = celsiusTemp;
        temperatures[1] = fahrenheitTemp;
        temperatures[2] = kelvinTemp;

    }

    public void validate(double celsiusTemp, double fahrenheitTemp, double kelvinTemp) throws InvalidTempException {
        int counter = 0;
        if(kelvinToFahrenheit(kelvinTemp) > 0.5){
            counter++;
        }
        if (kelvinToCelsius(celsiusTemp) > 0.5) {
            counter++;
        }
        if (fahrenheitToCelsius(fahrenheitTemp) > 0.5) {
            counter++;
        }
        if(counter > 1){
            throw  new InvalidTempException();
        }
    }

    public double get(char c ) {
        switch (c) {
            case 'C':
                return temperatures[0];
            case 'F':
                return temperatures[1];
            case 'K':
                return temperatures[2];
            default:
                throw new IllegalArgumentException("Invalid argument");
        }
    }

    public double fahrenheitToCelsius(double fahrenheitTemp){
        return (fahrenheitTemp - 32) * 5 / 9;
    }

    public double kelvinToCelsius(double celsiusTemp){
        return (celsiusTemp - 273.15);
    }

    public double kelvinToFahrenheit(double kelvinTemp){
        return (kelvinTemp * 9 / 5) - 459.67;
    }
}

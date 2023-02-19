import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        NumberFormat usnf = 
    NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat innf = 
    NumberFormat.getCurrencyInstance(new Locale("hi","IN"));
        System.out.println("US Format = "+ usnf.format(payment));
        System.out.println("India Format = "+ innf.format(payment));
        scanner.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Input your number:");
        n = input.nextInt();

        if(n % 2 != 0){
            System.out.print("Weird");
        } else {
            if(n >= 2 && n <= 5 ){
                System.out.print("Not Weird");
            } else if(n >= 6 && n <= 20 ){
                System.out.print("Weird");
            } else if(n >= 20){
                System.out.print("Not Weird");
            }
        }
        input.close();
    }
}

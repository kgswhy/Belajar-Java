import java.util.Scanner;
public class solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input int:");
        int x = sc.nextInt();
        System.out.print("Input double:");
        double y =  sc.nextDouble();
        System.out.print("Input string:");
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("String :"+ s);
        System.out.println("Double :"+ y);
        System.out.print("int:"+x);

        sc.close();
    }
}

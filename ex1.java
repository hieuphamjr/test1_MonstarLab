import java.util.Scanner;
public class ex1 {
    public static void main (String[] args){
        double a, b, c, delta, sqrt_delta;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        while(a==0){
            System.out.println("Invalid value of a! Try again:");
            a = scanner.nextDouble();
        }
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.println("Delta is smaller than 0");
        } else {
            sqrt_delta = Math.sqrt(delta);
            System.out.println(sqrt_delta);
        }
    }

}
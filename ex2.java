import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        int comsumption, totalBill;
        Scanner scanner = new Scanner(System.in);
        comsumption = scanner.nextInt();;
        while(comsumption < 0){
            System.out.println("Invalid value of a! Try again:");
            comsumption = scanner.nextInt()  ;
        }
        if (comsumption < 25){
            totalBill = comsumption * 1000;
        } else if (comsumption >= 25 && comsumption < 75){
            totalBill = comsumption * 1250;
        } else if (comsumption >= 75 && comsumption < 150){
            totalBill = comsumption * 1800;
        } else {
            totalBill = comsumption * 2500;
        }
        System.out.println(totalBill);
    }
}

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập số cần kiểm tra : ");
        number = scanner.nextInt();
        boolean check = true;
        if (number < 2){
            check = false;
        }
        if (number == 2){
            check = true;
        }
        if (number % 2 ==0){
            check = false;
        }for (int i =  3;i<number;i++){
            if (number % i == 0){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println(number + " is a prime number");
        }else {
            System.out.println(number +  " is not prime number");
        }
    }
}

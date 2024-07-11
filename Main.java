import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user
        System.out.println("Enter Second:");
        int inputUser = scanner.nextInt();

        //hours
        int hours= inputUser/3600;

        //mintes
        int min=(inputUser%3600)/60;

        //second
        int second=inputUser%60;

        System.out.println(hours+":"+min+":"+second);
    }
}

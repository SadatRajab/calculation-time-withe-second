import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user
        int inputUser = scanner.nextInt();

        //hours
        int hours= inputUser/3600;
        int hours2=(3600-inputUser);
        if(hours2<-1){ hours2=hours2*-1;}

        //mintes
        int min=hours2/60;
        int min2=(60-hours2);
        if (min2<-1){min2=min2*-1;}

        //second
        int second=min2/60;


    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ = scanner.nextInt();
        int pers = scanner.nextInt();
        for (int year = 1; year < 6; year++){
            summ +=(summ*pers)/100;
            System.out.println("За " +year+ " год вы поличили сумму "+summ+ " тугриков");


        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 10) System.out.println("Верно");
        else if (a != 10) System.out.println("Неверно");
    }
}

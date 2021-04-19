public class Main {
    public static void main(String[] args) {
        int n = 31;
        for (int i = 2; i < n; i++) {
            if (n % i != 0 ){
                System.out.println(false);
                break;
            }
            else if (n % i == 0){
                System.out.println(true);
                break;
            }
        }
    }
}

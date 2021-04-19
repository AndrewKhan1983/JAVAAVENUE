public class Main {
    public static void main(String[] args) {
        int mass[] = {2,3,4,5};
        int mno = 1;
        for (int i = 0; i < mass.length; i++) {
            mno = mno * mass[i];
        }
        System.out.println(mno);
    }
}

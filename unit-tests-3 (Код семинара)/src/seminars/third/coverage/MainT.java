package seminars.third.coverage;

public class MainT {
    public static void main(String[] args) {

        System.out.println(numberInInterval(99));
    }
    public static boolean numberInInterval(int n){
        if (n>=25 && n<=100) return true;
        return false;
    }
}

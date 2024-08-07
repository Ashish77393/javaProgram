public class RecursionTilingProblem {
    static double s;
    static double s1;

    public static double AreaBig(double l, double b) {
        s = l * b;
        return s;
    }

    public static double areaTails(double l, double b) {
        s1 = l * b;
        return s1;
    }

    public static double total() {
        double totaltail = s / s1;
        return totaltail;
    }

    public static void main(String[] args) {
        AreaBig(0, 21);
        areaTails(2, 2);
        System.out.println(total());
    }
}

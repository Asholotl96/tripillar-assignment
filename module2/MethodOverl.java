public class MethodOverl {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        MethodOverl math = new MethodOverl();       
        System.out.println(math.add(5, 10));
        System.out.println(math.add(5.5, 10.5));
        System.out.println(math.add(1, 2, 3));
    }
}
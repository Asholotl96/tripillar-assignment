class Print {
    public void print(String text) {
        System.out.println("Printing text: " +text);
    }
    public void print(int number) {
        System.out.println("Printing number: " +number);
    }
}
class ColorPrint extends Print {
    @Override
    public void print(String text) {
        System.out.println("Printing text in color: " +text);
    }
}
public class OverlOverr {
    public static void main(String[] args) {
        Print ob1 = new Print();
        ob1.print("Hello"); 
        ob1.print(18);     

        ColorPrint ob2 = new ColorPrint();
        ob2.print("Hello"); 
    }
}
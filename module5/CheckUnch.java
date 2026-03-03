import java.io.*;
public class CheckUnch {
    public static void main(String[] args) {
        try {
            throw new IOException(); 
        } catch (IOException e) {
            System.out.println("Caught Checked Exception");
        }
        int x = 10 / 0; 
    }
}
public class PalinCheck {
    public static boolean isPalin(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        
        return text.equals(reversed);
    }
    public static void main(String[] args) {
        System.out.println(isPalin("radar"));
    }
}
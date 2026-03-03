public class GC {
    public void finalize() {
        System.out.println("Object collected");
    }
    public static void main(String[] args) {
        GC m = new GC();
        m = null;
        System.gc();
    }
}
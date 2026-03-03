public class TLifeCycle {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            try { 
                Thread.sleep(500); 
            } catch (InterruptedException e) {}
        });
        System.out.println("State 1: " + t.getState()); 
        t.start();
        System.out.println("State 2: " + t.getState()); 
        Thread.sleep(100); 
        System.out.println("State 3: " + t.getState()); 
        t.join(); 
        System.out.println("State 4: " + t.getState());
    }
}
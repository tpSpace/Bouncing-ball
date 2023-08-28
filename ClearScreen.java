public class ClearScreen {
    public static final String ESC = "\u001B";
    public static final String HIDE_CURSOR = ESC + "[?25l";
    public static void Clear() {
        // initalize fps stuff
    long now;
    long updateTime;
    long wait;

    final int TARGET_FPS = 60;
    final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;
    
    now = System.nanoTime();

   

    updateTime = System.nanoTime() - now;
    wait = (OPTIMAL_TIME - updateTime) / 1000000;

    try {
        Thread.sleep(wait);
    } catch (Exception e) {
        e.printStackTrace();
    }


    System.out.print(HIDE_CURSOR);
        // try {
        //     Thread.sleep(10);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    System.out.print("\033[H\033[2J");  
    System.out.flush();
        
        
    }
}

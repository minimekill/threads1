


public class Task1 extends Thread {

    public void run(){
        long max = 1000000000;
        long res = 0;
        long start = System.currentTimeMillis();
        
        for (int i = 0; i <= max; i++) {
            res += i;
            
        }
        System.out.println("The Result is " + res);
        System.out.println("It took " + (System.currentTimeMillis() - start) + " milliseconds");
    }
    
}

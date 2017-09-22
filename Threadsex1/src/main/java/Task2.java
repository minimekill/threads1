


public class Task2 extends Thread {

    
    
    
    @Override
    public void run(){
        for (int i = 1; i < 6; i++) {
            try{
            System.out.println(i);
            Thread.sleep(2000);
            } catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
    
}




public class Task3 extends Thread{

    @Override
    public void run(){
        int i = 10;
        long start = System.currentTimeMillis();
        long timer = 0;
        
        while(timer<10000){
            
            System.out.println("tiden er " + timer/1000);
            
            
            try{
            System.out.println(i);
            i++;
            if(timer>7000){
                break;
            }
            Thread.sleep(3000);
            
            } catch(Exception e){
                e.printStackTrace();
            }
            
            timer = System.currentTimeMillis() - start;
        }
        
    }
    
}



package Excersize2;


public class Even1 extends Thread {

    
    private Even e;
    
    @Override
    public void run(){
    

    for (int i = 0; i < 10; i++) {
        
        System.out.println("even1 is doing " + e.next());
        
    }


}

    public Even1(Even e) {
    this.e = e;
    }

    
}

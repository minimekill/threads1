

package Excersize2;


public class Even2 extends Thread {

    
    private Even e;
    
    @Override
    public void run(){

    
    

    for (int i = 0; i < 10; i++) {
        System.out.println("even2 is doing " + e.next());
        
    }


}

    public Even2(Even e) {
    this.e = e;
    }


}

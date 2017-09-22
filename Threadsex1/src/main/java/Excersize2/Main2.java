

package Excersize2;


public class Main2 {

    
    public static void main(String[] args) {
        
        
        Even e = new Even();
        
        Even1 e1 = new Even1(e);
        Even2 e2 = new Even2(e);
        
        e2.start();
        e1.start();
    }
    
    
}

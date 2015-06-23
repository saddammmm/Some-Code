/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author shussain
 */
public class MultiTh {
int counter=0;
    public MultiTh() {
        NumbersThread t1=new NumbersThread(1);
        NumbersThread t2=new NumbersThread(2);
        NumbersThread t3=new NumbersThread(3);
        NumbersThread t4=new NumbersThread(4);
        t1.start();t2.start();t3.start();t4.start();
    }
    private class NumbersThread extends Thread implements Runnable{ 

NumbersThread(int n) 
{ 

   this.setName("Thread "+n); 

} 
public void run() 
{ 
while(counter < 100) 
{ 
counter++; 
Thread t = Thread.currentThread(); 
System.out.println( 
t.getName()+" is printing the counter = "+counter); 
try 
{ 
Thread.sleep(0); 
}catch(Exception e){} 
} 
} 
} 
    public static void main(String []args)
    {
        new MultiTh();
    }
    
}

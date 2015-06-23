/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author shussain
 */
public class Threads{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       FRun a=new FRun();
       Thread t=new Thread(a);
       t.start();t.setName("saddam");
          System.out.println("main thread"+Thread.currentThread().getName());     
    }
}
class FRun implements Runnable
{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable is running");
            System.out.println("Thread is run by"+Thread.currentThread().getName());
            try
            {
             Thread.sleep(5*60*1000);
            }
            catch(Exception e){}
        }
    }
    
}
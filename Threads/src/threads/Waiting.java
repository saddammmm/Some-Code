/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author shussain
 */
public class Waiting {
    public static void main(String []args) throws InterruptedException
    {
        someThing o=new someThing();
        synchronized(o)
        {
            o.wait();
            o.notify();
           
            
        }
        
    }
    
}
class someThing
{

    public someThing() {
        System.out.println("hell");
    }
    
}
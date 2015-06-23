/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author shussain
 */
public class MultiThread {
    public static void main(String[]args)
    {
        final Thread t1=new Thread(){
            public void run()
            {
                for (int i = 1; i <= 10; i++) {
                    int n=2;
                    int res=n*i;
                    System.out.println(res);
                }
            }
            
        };
        final Thread t2=new Thread(){
            public void run()
            {
                for (int i = 1; i <= 10; i++) {
                    int n=3;
                    int res=n*i;
                    System.out.println(res);
                }
            }
            
        };
        t1.start();
        t2.start();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class BouldHouce {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(fib(n+2)*fib(n+2));
    }
    
    public static int fib(int n)
    {
        int a=1,b=1;
       int c=0;
       if(n==1||n==2)
           return 1;
        for (int i = 2; i <n; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        
        return c;
    }
}

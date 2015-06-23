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
public class ZigZag {
  

    public static void main(String []args)
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int []S=new int[n];
        int []Sol=new int[n+1];
        for (int i = 0; i <n; i++) {
            S[i]=sc.nextInt();
            
        }
        int []S2=new int[n];
        for (int i = 0; i <n-1; i++) {
            S2[i]=S[i+1]-S[i];
        }
        int len=1;
        int dir=-1;
        for (int i = 0; i <n-1; i++) 
        {
            if(S2[i]*dir<0)
            {
                dir*=-1;
                len++;
            }
        }
        System.out.println(len);
    }
    
}

    


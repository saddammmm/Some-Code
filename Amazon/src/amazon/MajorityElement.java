/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author shussain
 */
public class MajorityElement {
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        ArrayList<Integer>A=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            A.add(sc.nextInt());
        }
       Collections.sort(A);
       int c=1;
        for (int i = 0; i <n; i++) {
            //int a=A.get(i);
            for (int j = i; j <n; j++) {
                if(A.get(i)==A.get(j))
                    c++;
            }
            if(c>n/2)
            {
                
                System.out.println(A.get(i));
                break;
            }
            if((c<n/2)&&(i==n-1))
            System.out.println("noo");
            c=0;
                
        }
       
    }
    
}

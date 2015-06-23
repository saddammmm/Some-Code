/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class B {
    public static void main(String []args)
    {
        int n,t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
        n=sc.nextInt();
        ArrayList<BigInteger>A=new ArrayList<>();
       for (int i = 0; i <n; i++) {
            A.add(sc.nextBigInteger());
        }
       int ss=0;
        if(n==1)
        {    System.out.println("1"+" "+"0");
            
        }
        
        else{
        for (int i = 2; i <=n; i++) {
            if(3*i+1==n||3*i==n||3*i-1==n)
            { ss=i;
            break;}
            }
        System.out.println(n-ss+" "+ss);
   
}
      t--;  }
    }
    
}

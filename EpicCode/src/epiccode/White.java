/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epiccode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class White {
    public static void main(String []args)
    {
        int n;
        //BigInteger m=BigInteger.ZERO;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>A=new ArrayList<>();
        n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            A.add(sc.nextInt());
        }
        List B= A.subList(0, n/2);
        List C= A.subList((n/2), n);
      
       Collections.reverse(C);
        System.out.println(B);
        System.out.println(C);
        int x,y,m=0,m2=0;
        x=y=n/2;
        while(x>0&&y>0)
        {
            for (int i = 0; i <x; i++) {
                
                     m+=((int)B.get(i)*(int)C.get(i));
                
              
            
            }
            if(m2<m)
                m2=m;
            x--;
            y--;
        }
        
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Skip {
    public static void main(String []args)
    {
        int n,q;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>L=new ArrayList<>();
        int l,r,k,sum;
        n=sc.nextInt();
        q=sc.nextInt();
        for (int i = 0; i <n; i++) {
           L.add(sc.nextInt());
        }
        System.out.println(L);
        for (int i = 0; i < q; i++) {
            l=sc.nextInt();
            r=sc.nextInt();
            k=sc.nextInt();
            sum=0;
            while(l<=r)
            {
                sum+=L.get(l-1);
                l+=k;
            }
            System.out.println(sum);
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class EfficientTriplet {
    
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
        System.out.println(A);
        int ans=0;
        for (int i = 0; i <n-1; i++) {
           int  k=i+2;
            for (int j = i+1; j < n; j++) {
                while(n>k&&A.get(i)+A.get(j)>A.get(k))
                    k++;
                ans+=k-j-1;
                
            }
            
        }
        System.out.println(ans);
    }
    
}

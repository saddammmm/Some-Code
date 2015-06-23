/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class Triplet {
    public static void main(String []args)
    {
        int n,a,b,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []L=new int[n];
        for (int i = 0; i < n; i++) {
            L[i]=sc.nextInt();
            
        }
        int count=0;
        for (int i = 0; i < n; i++) {
          
            for (int j = i+1; j <n; j++) {
          
                for (int k = j+1; k <n; k++) {
                   
                    if(L[i]+L[j]>L[k]&&L[j]+L[k]>L[i]&&L[i]+L[k]>L[j])
                        count++;
                }
            }
            
        }
        System.out.println(count);
    }
    
}

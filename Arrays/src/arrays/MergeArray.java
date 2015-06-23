/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class MergeArray {
    public static void main(String []args)
    {
       int n,m;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       m=sc.nextInt();
       int []A=new int[n];
      int NA=0;
       int []B={2,NA,7,NA,NA,10,NA};
        for (int i = 0; i <n; i++) {
         A[i]=sc.nextInt();
        }
        int j=m-1;
        for (int i = m-1; i>=0; i--) {
            
            if(B[i]!=NA)
            {B[j]=B[i];
            j--;
            }
            
        }
        merge(B, A);
    }
    public static int[] merge(int[] a, int[] b) {

    int[] answer = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length)
    {
        if (a[i] < b[j])       
            a[k++] = a[i++];

        else        
            a[k++] = b[j++];               
    }

    while (i < a.length)  
        a[k++] = a[i++];


    while (j < b.length)    
        a[k++] = b[j++];

    return a;
}
}

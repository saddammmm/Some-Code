/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epiccode;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class a {
    public static void main(String []args)
    {
        int n,T;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        T=sc.nextInt();
        int []A=new int[n];
        int []B=new int[n];
        for (int i = 0; i <n; i++) {
            A[i]=sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            B[i]=sc.nextInt();
        }
        
        int i = 0;
int j = 0; 
int  c=0;
while(i < A.length){
    while(j < B.length){
        if(A[i]-B[j] <= T){
            if(A[i]-B[j] >= -1 * T){
                c++;
                j++;//don't consider this value the next time
            }
            break;
        } 
        j++;
    }
    i++;
}
        System.out.println(c);    
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Saddam
 */
public class Merge {
    
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer>M=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            M.add(sc.nextInt());
        }
              mergeSort(M, 0, n-1);
              System.out.println(M);
    }
   public static void merge(ArrayList<Integer>A,int s,int m,int e)
   {
       int i,j,k;
       int n1=m-s+1;
       int n2=e-m;
       ArrayList<Integer>L=new ArrayList<>();
       ArrayList<Integer>H=new ArrayList<>();
       for (int l = 0; l <n1; l++) {
           L.add(A.get(s+l));
       }
       for (int l = 0; l <n2; l++) {
           H.add(A.get(m+1+l));
       }
       i=0;
       j=0;
       k=s;
       while(i<n1&&j<n2)
       {
           if(L.get(i)<=H.get(j))
           {
               A.set(k, L.get(i));
               i++;
           }
           else
           {
                A.set(k, H.get(j));
                j++;
           }
           k++;
       }
       while(i<n1)
       {
           A.set(k, L.get(i));
           i++;
           k++;
       }
        while(j<n2)
       {
           A.set(k, H.get(j));
           j++;
           k++;
       }
   }
   public static void mergeSort(ArrayList<Integer>A,int s,int e)
   { int me;
       if(s<e)
       { me=s+(e-s)/2;
         mergeSort(A, s, me);
         mergeSort(A, me+1, e);
         merge(A, s, me, e);
       }
   }
}
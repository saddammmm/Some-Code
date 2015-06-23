/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codejam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author shussain
 */
public class A {
    public static void main(String []args)
    {
        int t,c,n;
        ArrayList<Integer>I=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int t1 = 1; t1 <=t; t1++) 
            
        
{
        c=sc.nextInt();
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            I.add(sc.nextInt());
            
        }
        Credit(I, c,t1);
        
        I.clear();}
    }
    public static void Credit(ArrayList<Integer>I,int c,int t)
    {
        if(I.size()<2)
            return;
        Set<Integer>s=new HashSet<>(I.size());
        for (Integer v : I) {
            int target=c-v;
            if(!s.contains(target))
            { 
                s.add(v);
            } 
            else
            {
                int i=I.indexOf(v)+1;
                int j=I.indexOf(target)+1;
                if(i==j)
                {
                   List<Integer>II= I.subList(j, I.size());
                   j=II.indexOf(target)+1+i;
                    
                }
               
                if(i<j) System.out.println("Case "+"#"+t+": "+i+" "+j);
                else
                     System.out.println("Case "+"#"+t+": "+j+" "+i);
            }
                
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class LargestPrime {
     public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer>P=new ArrayList<>();
        for (int i = 2; i <=n; i++) {
            P.add(i);
        }
        System.out.println(P);
        for (int i = 0; i<=P.size(); i++) {
            if(P.get(i)!=0)
            System.out.println(P.get(i));
            for (int j = i; j <=P.size(); j++) {
                if(P.get(j)%P.get(i)==0)P.add(j, 0);
            }
        }
    }
}

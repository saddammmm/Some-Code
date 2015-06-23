/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asit;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class PascalTriangle {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Pas(n);
    }
    public static void Pas(int rows)
    {
        for(int i =0;i<rows;i++) {

            int number = 1;

            System.out.format("%"+(rows-i)*2+"s","");

            for(int j=0;j<=i;j++) {

                 System.out.format("%4d",number);

                 number = number * (i - j) / (j + 1);

                 

            }

            System.out.println();

        }

    }
}

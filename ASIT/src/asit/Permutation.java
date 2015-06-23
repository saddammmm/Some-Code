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
public class Permutation {
    public static void main(String[]args)
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int l=str.length();
        char[]input=str.toCharArray();
        boolean []used=new boolean[l];
       
        StringBuffer outputString=new StringBuffer();
        System.out.println(outputString);
       permute(input, outputString, used, l, 0);
    }
    public static void permute(char []input,StringBuffer outputString,boolean []used,int l,int lev)
    {
        if(lev==l)
        {
            System.out.println(outputString.toString());
            
            return;
        }
        for (int i = 0; i < l; i++) 
        {
            
           
            if(used[i])continue;
            
                outputString.append(input[i]);
                used[i]=true;
                permute(input, outputString, used, l, lev+1);
            
                used[i]=false;
                outputString.setLength(outputString.length()-1);
            
        }
    }
    
}

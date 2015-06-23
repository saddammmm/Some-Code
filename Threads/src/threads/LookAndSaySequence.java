/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Scanner;

/**
 *
 * @author shussain
 */
public class LookAndSaySequence {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        String num="1";
        for (int i = 0; i <n; i++) {
            num=lookandSay(num);
            System.out.println(num);
        }
        
    }
    public static String lookandSay(String num)
    {
        StringBuilder result=new StringBuilder();
        char repate=num.charAt(0);
        num=num.substring(1)+" ";
        int times=1;
        for (char actual : num.toCharArray()) {
            if(actual!=repate)
            {
                result.append(times+""+repate);
                times=1;
                repate=actual;
            }
            else
            {
                times+=1;
            }
        }
        return result.toString();
    }
}

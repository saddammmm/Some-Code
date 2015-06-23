/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.math.BigInteger;

/**
 *
 * @author shussain
 */
public class test {
    
    public static void main(String[] args)
    {
        Integer x=256;
        Integer y=x;
        int f=3;
        ++f;
        Integer n=5;
        ++n;
        System.out.println(x==y);
        ++y;
        System.out.println(x==y);
        System.out.println(y);
        System.out.println(f);
        System.out.println(n);
    }
    
}

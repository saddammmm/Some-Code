/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.Date;

/**
 *
 * @author shussain
 */
public class Sadd {
   

public static void main (String [] args) {
Runtime rt=Runtime.getRuntime();
    System.out.println("Total heap memory="+rt.totalMemory());
    System.out.println("Before Memory = "+ rt.freeMemory());
    rt.gc();
    System.out.println(rt.freeMemory());
    System.out.println(rt.totalMemory());
    rt.gc();
    System.out.println(rt.totalMemory());
 }
 }




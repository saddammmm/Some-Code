/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author shussain
 */
public class AA extends hh{
    static String s ="-";
    public static void main(String []args) throws InterruptedException
    {
        
        Thread.sleep(1);
        AA[]a=new AA[2];
        hh []h=new hh[2];
        sifter(h);
        sifter(a);
        
        sifter(7);
        System.out.println(s);
        
        
    }
    static void sifter(AA[]... a2) { s += "1"; }
 static void sifter(hh[]... b1) { s += "2"; }
 static void sifter(AA[] b1) { s += "3";
     System.out.println("jjj"); }
 static void sifter(Object o) { s += "4"; System.out.println("kkkkk");}
}
class hh
{
    
}
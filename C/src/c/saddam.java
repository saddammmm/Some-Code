/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author shussain
 */
class a{}
class b extends a{
}
public class saddam {
    static String s="-";
    public static void main(String[] args)
    {
        a[] aa=new a[2];
        b[] ba=new b[2];
        shifter(aa);
        shifter(ba);
        shifter(7);
        System.out.println(s);
    }
    public static void shifter(a[]... a2)
    {s+="1";}
    public static void shifter(b[]... a3)
    {s+="2";}
    public static void shifter(b[] a)
    {s+="3";}
    public static void shifter(Object o)
    {s+="4";}
}

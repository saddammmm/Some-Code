/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

/**
 *
 * @author shussain
 */
public class Str {
    public static void main(String []args)
    {
        String s1 = "spring ";
String s2 = s1 + "summer ";
s1.concat("fall ");
s2.concat(s1);
        System.out.println(s2);
        System.out.println(s2.concat("saddam"));
s1 += "winter ";
System.out.println(s1 + " " + s2);
    }
}

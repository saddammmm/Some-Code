/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.io.IOException;

/**
 *
 * @author shussain
 */
public class Over {
   
    public static void main(String[] args) throws IOException
    {
        Bar o=new Bar();
        o.doStuff(14, "hxahdgiadgidg");
    }
}
 class Foo {
public void doStuff(int y, String s) {
    System.out.println(y+" "+s);}
public void moreThings(int x) { }
}
class Bar extends Foo {
public void doStuff(int y, long s) throws IOException {
    System.out.println(y+" "+s); }
}
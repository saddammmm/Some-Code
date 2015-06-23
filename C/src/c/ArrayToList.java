/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shussain
 */
public class ArrayToList {
    public static void main(String []args)
    {
        String s[]={"saddam","manjul","Upendra"};
        List<String>ls=Arrays.asList(s);
        System.out.println(ls.size());
        System.out.println(ls);
        s[1]="sdfefefefe";
        System.out.println(ls.get(2));
        System.out.println(ls);
    }
    
}

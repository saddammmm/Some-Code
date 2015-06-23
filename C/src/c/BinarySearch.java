/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author shussain
 */
public class BinarySearch {
    public static void main(String []args)
    {
        String[]s={"one","two","three" ,"four"};
        Arrays.sort(s);
        for (String string : s)  System.out.println(string);
            System.out.println("\n one="+Arrays.binarySearch(s, "one"));
        
        System.out.println("Reverse sort");
        ReSortCom rs=new ReSortCom();
        Arrays.sort(s,rs);
        for (String string : s) System.out.println(string);
                System.out.println("\n one ="+Arrays.binarySearch(s, "one"));
            System.out.println("\n one ="+Arrays.binarySearch(s, "one", rs));
        
    }
    static class ReSortCom implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

    
}
}

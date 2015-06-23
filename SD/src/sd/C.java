
package sd;
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.ArrayList;
import java.util.Scanner;
class C{
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        ArrayList<Integer>A=new  ArrayList<>();
        for(int i=0;i<n;i++)
        {
        	A.add(sc.nextInt());
        }
              int s=0;
             
        for( int i=1;i<n;i++)
        {
        	if(A.get(i)==0)
                    A.set(i-1, 0);
        }
        for (int k = 0; k <n; k++) {
            s+=A.get(k);
        }
        System.out.println(s);
    }
}

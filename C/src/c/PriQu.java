/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package c;
//import c.co.i
import java.util.PriorityQueue;

import java.util.Comparator;

/**
 *
 * @author shussain
 */
public class PriQu {
    public static void main(String[]args)
    {
        int []a={1,5,9,3,18,7,22};
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        
        for (int i : a) {
         pq.offer(i);
        }
        for (int i : a) {
            System.out.print(pq.poll()+" ");
            //System.out.println("");
        }
      in  co=new in();
        PriorityQueue<Integer>pq2=new PriorityQueue<Integer>(10,co);
        for(int x : a) // load queue
pq2.offer(x);
System.out.println("size " + pq2.size());
System.out.println("peek " + pq2.peek());
System.out.println("size " + pq2.size());
System.out.println("poll " + pq2.poll());
System.out.println("size " + pq2.size());
for(int x : a) // review queue
System.out.print(pq2.poll() +" ");
        }

    private static class in {

        public in() {
        }
    }
    
}
class com
{
    static class in implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
             
           return o2-o1;
           
        }
    
}

}

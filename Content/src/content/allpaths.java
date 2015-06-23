/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

/**
 *
 * @author shussain
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
 
class allpaths implements Runnable{
    static public int j=0;
 static public int Size_off_data;
 static public ArrayList<Integer>SIZE=new ArrayList<>();
 static int dim = 9, size = 0; // dim is number of nodes in graph
 // size had been used to keep record of index to remove node from Arraylist
    static boolean[] color = new boolean[dim + 1];      // to remember visit
    static int[][] graph = new int[50][50];
    static ArrayList<Integer> al = new ArrayList<Integer>();
    
 
    public static void main(String[] S) throws IOException {
        Runnable r=new allpaths();
                Thread k=new Thread(r);
                
       
       
         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
         
          RE e=new RE();
        
         
        for (int I = 1; I <= dim; I++) {
            String[] s = br.readLine().split(" ");
            int len = s.length;
            for (int J = 1; J <= len; J++) {
                graph[I][J] = Integer.parseInt(s[J - 1]);
            }
        }
        Arrays.fill(color, false);      // initially all are unvisited
 
        int src = Integer.parseInt(br.readLine());      //Source node
        int dst = Integer.parseInt(br.readLine());      //Destination node
           Size_off_data= Integer.parseInt(br.readLine());
        //dfs(src, dst);  // backtracking
       dfs(src, dst,Size_off_data);
       k.start();
    }
 
    static HashMap<Float,ArrayList> dfs(int src, int dst,int s) {
         RE e=new RE();
          allpaths all=new allpaths();
         Thread t=new Thread(all);
        HashMap<Float,ArrayList>Pathh=new HashMap<>();
        al.add(src);
        size++;
        Packet p=new Packet();
      
        color[src] = true;
        if (src == dst) {     
            
                //System.out.print(al+ "  ");
                Pathh.put(e.cost().get(j), al);
                System.out.println(Pathh+" ");
                SIZE.add((al.size()-1)*(Math.round(p.Packetize(s).get(j))));
                
                j++;
            
           // System.out.println();
           
        }
        for (int I = 1; I <= dim; I++) {
            if (graph[src][I] == 1) {
                if (color[I] == false) {
                    dfs(I, dst,s);        
                    color[I] = false;   
                    size--;
                    al.remove(size);
                }
            }
        }
     return Pathh;
    }

    @Override
    public void run() { 
        Packet p=new Packet();
        System.out.println("Data is sending ....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(allpaths.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        System.out.println("Delay in CCMR :"+SIZE);
    }
}
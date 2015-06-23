/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amazon;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author shussain
 */

    
class SmallestNum_In_SortedMatrix{
     private static class Cell implements Comparable<Cell> {

    private final int x;
    private final int y;
    private final int value;

    public Cell(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    @Override
    public int compareTo(Cell that) {
        return this.value - that.value;
    }

}
private static int findMin(int[][] matrix, int k) {

    int min = matrix[0][0];

    PriorityQueue<Cell> frontier = new PriorityQueue<>();
    frontier.add(new Cell(0, 0, min));

    while (k > 1) {

        Cell poll = frontier.remove();

        if (poll.y + 1 < matrix[poll.x].length) frontier.add(new Cell(poll.x, poll.y + 1, matrix[poll.x][poll.y + 1]));
        if (poll.x + 1 < matrix.length) frontier.add(new Cell(poll.x + 1, poll.y, matrix[poll.x + 1][poll.y]));

        if (poll.value > min) {
            min = poll.value;
            k--;
        }

    }

    return min;

}
public static void main(String[]args)
        {
             int n,m;
			 Scanner sc=new Scanner(System.in);
			 n=sc.nextInt();
			 m=sc.nextInt();
			 int[][]A=new int[n][m];
			 for(int i=0;i<n;i++)
			 {
			  for(int j=0;j<n;j++)
			 {
			          A[i][j]=sc.nextInt();
			    }
			 
			    }
				int k=sc.nextInt();
				System.out.println(findMin(A,k));
           }
}
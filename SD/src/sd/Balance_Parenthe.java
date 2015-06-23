/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shussain
 */
public class Balance_Parenthe {
    public static void main(String[]args)
    {
        String t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextLine();
        if(Check(t))
            System.out.println("yes");
        else
            System.out.println("no");
        
    }
   public static boolean Check(String st)
   {
       Stack<Character> a=new Stack<Character>();
       for (int i = 0; i <st.length(); i++) {
           
           char at=st.charAt(i);
           if(at=='['||at=='{'||at=='(')
               a.push(at);
           else
               if(at==']'||at=='}'||at==')')
               {
                   if(a.empty())
                       return false;
                   switch(at)
                   {
                       case ']':
                        if (a.pop() != '[')
                            return false;
                        break;
                    // Opening curly brace
                    case '}':
                        if (a.pop() != '{')
                            return false;
                        break;
                    // Opening paren brace
                    case ')':
                        if (a.pop() != '(')
                            return false;
                        break;
                    default:
                        break;
               }
               }
           
           
       }
       if(a.empty())
            return true;
        return false;
   }
}

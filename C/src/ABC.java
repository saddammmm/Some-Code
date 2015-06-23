/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shussain
 */
public class ABC {
    public static void main(String[]args)
    {
        
   
       a aa=new a();
       a.b ab=aa.new b();
       ab.go();
    }
}
class a
{
      class b
    {
        public void go()
        {
            System.out.println("gggg");
        }
    }
}
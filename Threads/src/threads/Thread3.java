package threads;

class Thread3 extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]) throws InterruptedException{  
 Thread3 t1=new Thread3();  
 Thread3 t2=new Thread3();  
 Thread3 t3=new Thread3();  
 t1.start();  
 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t2.join();
 t3.start();  
 }  
}  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexamples4;

/**
 *
 * @author dell
 */
public class UseThread {
    public static void main(String[] args) {
        Runnable r=()->{
                         try
                         {
                             for(int i=2;i<=10;i+=2)
                             {
                                 System.out.println("child thread:"+i);
                                 Thread.sleep(200);
                             }
                         }
                         catch(InterruptedException ex)
                         {
                             System.out.println("child interrupted!");
                         }
                         System.out.println("child thread finished");
            
                        };
        Thread th=new Thread(r);
        th.start();
        try
                         {
                             for(int i=1;i<=10;i+=2)
                             {
                                 System.out.println("main thread:"+i);
                                 Thread.sleep(200);
                             }
                         }
                         catch(InterruptedException ex)
                         {
                             System.out.println("main interrupted!");
                         }
                         System.out.println("main thread finished");
    }
}

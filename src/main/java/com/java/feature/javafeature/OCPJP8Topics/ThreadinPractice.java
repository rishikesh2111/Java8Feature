package com.java.feature.javafeature.OCPJP8Topics;

public class ThreadinPractice {

    public static void main(String[] args){

/*     Thread t = new MyThread(){
         public void run(){
         System.out.println("foo ");
         }
     };

     t.start();*/

      /*  Thread t = new Thread();
        t.start();
        System.out.println("x");
        t.wait(10000);
        System.out.println("Y");
     *//* MyThread t = new MyThread();
      Thread thread = new Thread(t);
      thread.start();
      for(int i = 0; i< 4; i++){
          System.out.println(i);
          Thread.currentThread().sleep(1000);
      }*//*
     System.out.println("1 ");
     synchronized (args){
         try{
             System.out.println("2 ");
             args.wait();
         }catch(InterruptedException ex){}
     }
        System.out.println("3 ");*/
/*         Chess ch = new Chess();
         Thread t = new Thread(ch);
         t.start();
         new Thread(new Chess()).start();*/
          // new ChickYack().go();
/*           Thread t =new Thread(new Leader());
           t.start();
           System.out.println("m1 ");
           t.join();
           System.out.println("m2 ");*/
/*   final ThreadDemo x = new ThreadDemo();
   final ThreadDemo y = new ThreadDemo();

   Runnable runnable = () -> {
       int option = (int)(Math.random() *4);
       switch (option){
           case 0: x.a();break;
           case 1: x.
       }
   };*/
     laurel = new Thread(){
         public void run(){
             System.out.println("A");
             try {
                 Thread.sleep(1000);
             }catch (Exception ex){
                 System.out.println("B");
             }
             System.out.println("C");
         }
     };
     hardy = new Thread(){

         public void run(){
          System.out.println("D");
          try {
              laurel.wait();
          }catch(Exception ex){
              System.out.println("E");
          }
          System.out.println("F");
         }
     };
      laurel.start();
      hardy.start();
    }
  static Thread laurel, hardy;
}

class ThreadDemo{

    synchronized void a(){
       actBusy();
    }
    static synchronized void b(){
        actBusy();
    }

    static void actBusy(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ie){

        }
    }

}
class Leader implements Runnable{
    public void run(){
        System.out.println("r1 ");
        System.out.println("r2 ");
    }
}

class ChickYack implements Runnable{
    Chicks chicks;

    void go(){
        chicks = new Chicks();
        new Thread(new ChickYack()).start();
        new Thread(new ChickYack()).start();
    }
    public void run(){
        chicks.yack(Thread.currentThread().getId());
    }
}
class Chicks{
    synchronized void yack(long id){
        for(int x = 1; x < 3; x++){
            System.out.println(id+"  ");
            Thread.yield();
        }
    }
}
class Chess implements Runnable{

    public void run(){
       move(Thread.currentThread().getId());
    }
    void move(long id){
     System.out.println(id +"   ");
     System.out.println(id +"  ");
    }
}

class MyThread extends Thread{
    MyThread() {
     System.out.println("MyThread ");
    }
   public void run(){
      System.out.println("bar ");
       }
       public void run(String args){
        System.out.println("baz ");
   }
}

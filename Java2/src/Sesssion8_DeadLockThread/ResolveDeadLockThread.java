/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesssion8_DeadLockThread;

/**
 *
 * @author lhhuong
 */
public class ResolveDeadLockThread {
    public static Object obj1 = new Object();
    public static Object obj2 = new Object();
    
    public static void main(String args[]){
        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo2 t2 = new ThreadDemo2();
        t1.start();
        t2.start();
    }
    
    private static class ThreadDemo1 extends Thread{
        public void run(){
            synchronized(obj1){
                System.out.println("Thread 1: Dang giu obj1 ...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 1: Dang cho obj2 ....");
                synchronized(obj2){
                    System.out.println("Thread 1: Dang giu obj1 va obj2 ...");
                }
            }
        }
    }
    
    private static class ThreadDemo2 extends Thread{
        public void run(){
            synchronized(obj1){
                System.out.println("Thread 2: Dang giu obj2 ...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread 2: Dang cho obj1 ....");
                synchronized(obj2){
                    System.out.println("Thread 2: Dang giu obj1 va obj2 ...");
                }
            }
        }
    }
}

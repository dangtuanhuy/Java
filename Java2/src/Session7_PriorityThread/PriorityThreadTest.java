package Session7_PriorityThread;


import Session7_PriorityThread.PriorityThread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lhhuong
 */
public class PriorityThreadTest {
    public static void main(String[] args) throws InterruptedException{
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
    }
}

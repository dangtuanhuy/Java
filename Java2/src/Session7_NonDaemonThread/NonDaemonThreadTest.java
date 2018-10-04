/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session7_NonDaemonThread;

/**
 *
 * @author lhhuong
 */
public class NonDaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new WorkingThread(), "My Non-Daemon Thread");
        dt.start();
        
        // continue program
        Thread.sleep(3000);
        System.out.println(">><< Finishing main program");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session7_DaemonThread;

import Session7_NonDaemonThread.WorkingThread;

/**
 *
 * @author lhhuong
 */
public class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new WorkingThread(), "My Daemon Thread");
        dt.setDaemon(true);
        dt.start();
 
        // continue program
        Thread.sleep(3000);
        System.out.println(">><< Finishing main program");
    }
}

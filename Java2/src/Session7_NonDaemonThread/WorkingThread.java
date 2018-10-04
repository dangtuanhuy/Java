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
public class WorkingThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            processSomething();
        }
    }
 
    private void processSomething() {
        try {
            System.out.println("Processing working thread");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

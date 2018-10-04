/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session7_PriorityThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lhhuong
 */
public class PriorityThread extends Thread {
    @Override
    public void run(){
        System.out.println("");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i+" Thread name: "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PriorityThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

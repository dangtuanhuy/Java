/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8_JoinMethodThread;

/**
 *
 * @author lhhuong
 */
public class JoinThread extends Thread {
    private String threadName;
    private int count;
    public JoinThread(String threadName, int count){
        this.threadName = threadName;
        this.count = count;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from "+this.threadName+" "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("\n ===> Thread "+this.threadName+" end!\n");  
    }
}

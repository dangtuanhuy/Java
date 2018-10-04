/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8_JoinMethodThread;

import sun.audio.AudioPlayer;

/**
 *
 * @author lhhuong
 */
public class JoinMethodTest {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("-----------Main thread dang chay--------------");
        //Tao hai thread se su dung phuong thuc join()
        Thread joinThreadA = new JoinThread("A", 2);
        Thread joinThreadB = new JoinThread("B", 3);
        
        //Tao thread thong thuong, khong su dung phuong thuc join()
        Thread noJoinThread = new JoinThread("C", 5);
        
        joinThreadA.start();
        joinThreadB.start();
        noJoinThread.start();
        
        //goi phuong thuc join()
        joinThreadA.join();
        joinThreadA.join();
        
        
        //Doan chuong trinh ben duoi se khong duoc chay cho toi khi nao
        //hai thread A va B hoan thanh
        System.out.println("Xin chao main Thread");
        System.out.println("Thread A con song ko? => "+joinThreadA.isAlive());
        System.out.println("Thread B con song ko? => "+joinThreadB.isAlive());
        System.out.println("Thread C con song ko? => "+noJoinThread.isAlive());
        
        System.out.println("Ket thuc main Thread");
    }
}

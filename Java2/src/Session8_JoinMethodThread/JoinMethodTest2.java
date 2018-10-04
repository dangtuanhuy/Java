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
public class JoinMethodTest2 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Bat dau main Thread");
        Thread joinThreadA = new JoinThread("A", 5);
        joinThreadA.start();
        
        joinThreadA.join(5000);
        
        System.out.println("main Thread bat dau chay sau 5000 mili giay");
        System.out.println("Xin chao main Thread");
        System.out.println("Thread A con song khong? => "+joinThreadA.isAlive());
        System.out.println("Ket thuc main Thread");
    }
}
